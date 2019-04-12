/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lego;

/**
 *
 * @author camel
 */

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.logging.Logger;
import org.camelia.example.lego.LegoSet;
import org.camelia.example.lego.ConstructedLegoToy;
import org.camelia.example.lego.LegoServiceGrpc;
import services.JmDNSRegistrationHelper;

public class LegoServer {
    private static final Logger logger = Logger.getLogger(Server.class.getSimpleName());
    private static int port = 50052;
    private Server server;
  

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new LegoServer.LegoServiceImpl())
                .build()
                .start();
        logger.info("Server started, listening on port:" + port);
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Camelia", "_lego._udp.local.", "", port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                LegoServer.this.stop();
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
        final LegoServer server = new LegoServer();
        server.start();
        server.blockUntilShutdown();
    }
   
    private class LegoServiceImpl extends LegoServiceGrpc.LegoServiceImplBase {   
        //unary
        @Override
        public void buildLego(LegoSet request, StreamObserver<ConstructedLegoToy> responseObserver) {    
          
            //create the response
            //String completed = request.getName() + "is done ";      
            ConstructedLegoToy response = ConstructedLegoToy.newBuilder().setCompleted(true).build();
            
            responseObserver.onNext(response);
            responseObserver.onCompleted();         
       }       
    }   
}
