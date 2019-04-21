/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camelia.example.lego;

/**
 *
 * @author camel
 */
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.logging.Logger;
import services.JmDNSRegistrationHelper;
import serviceui.Printer;
import serviceui.ServiceUI;

public class LegoServer {
    private static final Logger logger = Logger.getLogger(LegoServer.class.getSimpleName());
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
        private Printer ui;
        
        public LegoServiceImpl(){
            String name = "Camelia's";
            String serviceType = "_lego._udp.local.";
            ui = new ServiceUI(name + serviceType);
        }
        //unary stream
        @Override
        public void buildLego(LegoSet request, StreamObserver<ConstructedLegoToy> responseObserver) {    
            //create the response  
            HashMap<String,Integer>numberOfBricksPerSet = new HashMap<String,Integer>();
                    numberOfBricksPerSet.put("Brickmaster Legends of CHIMA: The Quest for Chi parts", 187);
                    numberOfBricksPerSet.put("Ewar's Acro Fighter", 33);
                    numberOfBricksPerSet.put("Winzar's Pack Patrol", 38);
                    numberOfBricksPerSet.put("Spider Crawler", 40);
                    numberOfBricksPerSet.put("Chi Hyper Laval", 122);

                    request = LegoSet.newBuilder()
                        .setName("CHIMA")
                        .setDescription("This is a list of 'Legends of Chima' lego sets, and the number of bricks per/set")
                        .putAllNumberOfBricksPerSet(numberOfBricksPerSet)
                        .build();
            
            ConstructedLegoToy response = ConstructedLegoToy.newBuilder().setLegoSet(request).setCompleted(true).build(); 
            ui.append("***BUILD LEGO***" + response.toString());
            responseObserver.onNext(response);
            responseObserver.onCompleted();   
           
       }    
        
        //bi-directional stream
        @Override
        public StreamObserver<LegoPieceRequest> legoPiece(final StreamObserver<LegoPieceResponse> responseObserver) {
            return new StreamObserver<LegoPieceRequest>(){
            String result;
                @Override
                public void onNext(LegoPieceRequest value) {    
                    String result = "This LEGO set belongs to  " + value.getProductLine().getName() + " Product Line";
                    LegoPieceResponse legoPieceResponse = LegoPieceResponse
                        .newBuilder()
                        .setResult(result)
                        .build();
                   //
                    ui.append(legoPieceResponse.toString());
                    responseObserver.onNext(legoPieceResponse);                               
               }
                @Override
                public void onError(Throwable thrwbl) {
                    //...
                }
                @Override
                public void onCompleted() {                       
                    responseObserver.onCompleted();
                }
            };          
        }
    }   
}
