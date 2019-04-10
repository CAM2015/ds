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
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import ipad.IPadServer;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.util.logging.Logger;

import org.camelia.example.lego.LegoSet;
import org.camelia.example.lego.ConstructedLegoToy;
import org.camelia.example.lego.LegoServiceGrpc;

//import org.camelia.example.lego.Song;
//import org.camelia.example.lego.SongList;
import services.JmDNSRegistrationHelper;

public class LegoServer {
    private static final Logger logger = Logger.getLogger(Server.class.getSimpleName());
    private static int port = 50023;
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
            
            String completed = "Is it completed " + request.getName();
            ConstructedLegoToy response = ConstructedLegoToy.newBuilder().setCompleted(true).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
           
       }
        
    }
     
}
