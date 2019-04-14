/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meter;

import java.util.Map;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.camelia.example.meter.AccountInfo;
import org.camelia.example.meter.FundsAdded;
import org.camelia.example.meter.FundsAddedConfirmation;
import org.camelia.example.meter.MeterServiceGrpc;
import org.camelia.example.meter.Status;
import services.JmDNSRegistrationHelper;

/**
 *
 * @author camel
 */
public class MeterServer {
    private static final Logger logger = Logger.getLogger(Server.class.getSimpleName());
    private static int port = 50054;
    private Server server;
    
    
    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new MeterServer.MeterServiceImpl())
                .build()
                .start();
        logger.log(Level.INFO, "Server started, listening on port:{0}", port);
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Camelia", "_meter._udp.local.", "", port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                MeterServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }
    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
  
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
    
    public static void main(String[] args) throws Exception {
        final MeterServer server = new MeterServer();
        server.start();
        server.blockUntilShutdown();
    }
    
    private class MeterServiceImpl extends MeterServiceGrpc.MeterServiceImplBase {  
        // add default amounts to accounts
        double accounts [] = { 0, 100, 40 };
        // Queue for notifications that need to be sent to corresponding notification client
       private Map<Integer,Queue<AccountInfo>> map = new HashMap<>();

       private MeterServiceImpl(){
           super();
            map.put(0, new ConcurrentLinkedQueue<>());
            map.put(1, new ConcurrentLinkedQueue<>());
            map.put(2, new ConcurrentLinkedQueue<>());
       }
        @Override
        public void funds(FundsAdded request, StreamObserver<FundsAddedConfirmation> responseObserver) {
            //create the response
            FundsAddedConfirmation response;
            
            //banking process
            if (fundsAdded(request.getFromAccountId(), request.getToAccountId(), request.getAmount())){
                response = FundsAddedConfirmation.newBuilder()
                        .setMessage("FUNDS ADDED")
                        .setStatus(Status.SUCCESS)
                        .build();            
            }else {
                response = FundsAddedConfirmation.newBuilder()
                        .setMessage("NO FUNDS ADDED")
                        .setStatus(Status.FAILED)
                        .build();
            }
        responseObserver.onNext(response);
        responseObserver.onCompleted();    
        }
        
        private AccountInfo accountInfo(int ac, double amount) {
            return AccountInfo.newBuilder()
                    .setAccountId(ac)
                    .setAmount(amount)
                    .setBalance(accounts[ac])
                    .build();
        }
        
        private boolean fundsAdded(int fromAccount, int toAccount, double amount) {
            if (accounts[fromAccount] < amount) {
                amount = accounts[fromAccount] - amount;
                amount = accounts[toAccount] + amount;
                map.get(fromAccount).add(accountInfo(fromAccount, amount));
                map.get(toAccount).add(accountInfo(toAccount, amount));
            }else {
                map.get(fromAccount).add(accountInfo(fromAccount, amount));
                return false;
            }
            return true;
        }
   }
}

       