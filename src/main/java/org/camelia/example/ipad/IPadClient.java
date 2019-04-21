
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

import client.ServiceDescription;
import client.ServiceObserver;
import client.jmDNSServiceTracker;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IPadClient implements ServiceObserver{
    private static final Logger logger = Logger.getLogger(IPadClient.class.getName());

    private ManagedChannel channel;
    private IPadServiceGrpc.IPadServiceBlockingStub blockingStub;
    private IPadServiceGrpc.IPadServiceStub asyncStub;
    private final String interestedService;
    
    public IPadClient(String host, int port) {
        interestedService = "_ipad._udp.local.";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        serviceAdded(new ServiceDescription("52.91.20.79", 50025));
    }
    
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void getAllSongs() {
    logger.info("**************************************");
    logger.info("***** RETURNING PINK'S SONGS DETAILS*****");  
    ArtistId request = ArtistId.newBuilder().setId(1).build();
    SongList songList = blockingStub.allSongs(request);
        for (Song song : songList.getSongsList()) {
            logger.info(song.toString());
        }
        logger.info("finished returning Pink's songs details!");
    }
    
    
    public void getAllArtists() throws InterruptedException {
        logger.info("**************************************");
        logger.info("***** RETURNING A LIST OF ARTISTS*****");  
        
        IPadServiceGrpc.IPadServiceStub asyncStub = IPadServiceGrpc.newStub(channel);
        Empty request = Empty.newBuilder().build();
        final CountDownLatch latch = new CountDownLatch(1);
        
        StreamObserver<AllArtists> responseObserver;
        responseObserver = new StreamObserver<AllArtists>() {
            
            @Override
            public void onNext(AllArtists response) {
                logger.log(Level.INFO, "get artist: {0}", response);
            }            
            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }
            @Override
            public void onCompleted() {
                logger.info("finished returning the list of Artists!");
                latch.countDown();
            }
        };
        asyncStub.getArtists(request, responseObserver);
        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
    }
    
    @Override
    public boolean interested(String type) {
        return interestedService.equals(type);
         
    }

    @Override
    public List<String> serviceInterests() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(interestedService);
        return list;
    }

    @Override
    public void serviceAdded(ServiceDescription service) {
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = IPadServiceGrpc.newBlockingStub(channel);
        System.out.println("I got the information about the service, now i can call the service");
        try {
            getAllSongs();
            getAllArtists();
        } catch (InterruptedException ex) {
            Logger.getLogger(IPadClient.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    @Override
    public String getName() {
        return "Song & Artist Client";
    }

    @Override
    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) throws InterruptedException{
            IPadClient client = new IPadClient("localhost", 50025);

    }
}
