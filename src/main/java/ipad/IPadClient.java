
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipad;

/**
 *
 * @author camel
 */

import client.ServiceDescription;
import client.ServiceObserver;
import client.jmDNSServiceTracker;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import java.util.logging.Logger;
import org.camelia.example.ipad.ArtistId;
import org.camelia.example.ipad.IPadServiceGrpc;
import org.camelia.example.ipad.Song;
import org.camelia.example.ipad.SongList;

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

    }
    
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void getSongList() {
    logger.info("call listSongs() method: ");
    ArtistId request = ArtistId.newBuilder().setId(1).build();
    SongList songList = blockingStub.allSongs(request);
        for (Song song : songList.getSongsList()) {
            logger.info(song.toString());
        }
        logger.info("finished!");
    }
    
    public void getSongsUsingStream() {
        logger.info("call getSongs() method: ");
        ArtistId request = ArtistId.newBuilder().setId(1).build();
        Iterator<Song> iterator = blockingStub.getSongs(request);
        while (iterator.hasNext()) {
            logger.info(iterator.next().toString());
        }
        logger.info("finished!");
    }
    
    public void getSongsUsingAsyncStub() throws InterruptedException {
        logger.info("call getSongs() method using asynchronous stub: ");
        ArtistId request = ArtistId.newBuilder().setId(1).build();
        final CountDownLatch latch; // using CountDownLatch
        latch = new CountDownLatch(1);

        StreamObserver<Song> responseObserver;
        responseObserver = new StreamObserver<Song>() {
            @Override
            public void onNext(Song value) {
                logger.log(Level.INFO, "get song: {0}", value.toString());
            }

            @Override
            public void onError(Throwable t) {
                Status status = Status.fromThrowable(t);
                logger.log(Level.INFO, "failed with status: {0}", status);
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                logger.info("finished!");
                latch.countDown();
            }
        };
        asyncStub.getSongs(request, responseObserver);
        latch.await();
    }
    
    @Override
    public boolean interested(String type) {
        return interestedService.equals(type);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }

    @Override
    public List<String> serviceInterests() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(interestedService);
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void serviceAdded(ServiceDescription service) {
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = IPadServiceGrpc.newBlockingStub(channel);
        System.out.println("I got the information about the service, now i can call the service");
        getSongsUsingStream();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return "Song Client";
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) throws InterruptedException{
            IPadClient client = new IPadClient("localhost", 50052);
//            try {
//                client.getSongList();
//                client.getSongsUsingStream();
//                client.getSongsUsingAsyncStub();
//            } finally {
//            client.shutdown();
//        }
    }

}
