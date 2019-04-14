
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camelia.example.ipad;

/**
 *
 * @author camel
 */


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
//import org.camelia.example.ipad.Artist;
//import org.camelia.example.ipad.ArtistId;
//import org.camelia.example.ipad.IPadServiceGrpc;
//import org.camelia.example.ipad.Song;
//import org.camelia.example.ipad.SongList;
import services.JmDNSRegistrationHelper;

public class IPadServer {
    private static final Logger logger = Logger.getLogger(IPadServer.class.getName());
	  /* The port on which the server should run */
    private int port = 50052;
    private Server server;

    private void start() throws Exception {
        server = ServerBuilder.forPort(port)
                .addService(new IPadServer.IPadImpl())
                .build()
                .start();
        logger.info("Server started, listening on port:" + port);
        JmDNSRegistrationHelper helper = new JmDNSRegistrationHelper("Camelia", "_ipad._udp.local.", "", port);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                IPadServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }
    
    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon
     * threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
    
      /**
     * Main launches the server from the command line.
     */
    public static void main(String[] args) throws Exception {
        final IPadServer server = new IPadServer();
        server.start();
        server.blockUntilShutdown();
    }

    private class IPadImpl extends IPadServiceGrpc.IPadServiceImplBase {
        
        private List<Song> songs;
        
        @Override
		//unary RPC
        public void allSongs(ArtistId request, StreamObserver<SongList> responseObserver) {
            SongList list = SongList.newBuilder().addAllSongs(pinkSongs(request)).build();
            responseObserver.onNext(list);
            responseObserver.onCompleted();
        }
        
        @Override
		//server streaming RPC
        public void getSongs(ArtistId request, StreamObserver<Song> responseObserver) {
            songs = pinkSongs(request);
                for (Song song: songs) {
                    responseObserver.onNext(song);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        responseObserver.onError(e);
                    }
                }
            responseObserver.onCompleted();
        }

		
        public List<Song> pinkSongs(ArtistId request) {
            Artist artist = Artist.newBuilder().setId(request.getId()).setName("Pink").build();
            songs = new ArrayList<Song>();
            songs.add(Song.newBuilder().setId(1).setName("Stupid Girls").setArtist(artist).build());
            songs.add(Song.newBuilder().setId(2).setName("Try").setArtist(artist).build());
            songs.add(Song.newBuilder().setId(3).setName("So What").setArtist(artist).build());
            songs.add(Song.newBuilder().setId(3).setName("Just Like Fire").setArtist(artist).build());
            songs.add(Song.newBuilder().setId(3).setName("What About Us").setArtist(artist).build());
        return songs;
        }
    
    }
}
