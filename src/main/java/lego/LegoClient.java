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

import client.ServiceDescription;
import client.ServiceObserver;
import client.jmDNSServiceTracker;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.camelia.example.lego.LegoSet;
import org.camelia.example.lego.LegoPieceRequest;
import org.camelia.example.lego.LegoPieceResponse;
import org.camelia.example.lego.ConstructedLegoToy;
import org.camelia.example.lego.LegoServiceGrpc;
import org.camelia.example.lego.ProductLine;



public class LegoClient implements ServiceObserver {
    private static final Logger logger = Logger.getLogger(LegoClient.class.getName());
    protected LegoClientGUI ui;
    private final String name;
    private ManagedChannel channel;
    private LegoServiceGrpc.LegoServiceBlockingStub blockingStub;
    private final String interestedService;
    private LegoServiceGrpc.LegoServiceStub asyncStub;
    
    public LegoClient(String host, int port) {
        interestedService = "_lego._udp.local.";
        name = "AI LEGO BUILDER";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
      
    }
    
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

   String getBuildLego() {
        logger.info("attempting to build lego...");  
        HashMap<String,Integer>numberOfBricksPerSet = new HashMap<>();
            numberOfBricksPerSet.put("Brickmaster Legends of CHIMA: The Quest for Chi parts", 187);
            numberOfBricksPerSet.put("Ewar's Acro Fighter", 33);
            numberOfBricksPerSet.put("Winzar's Pack Patrol", 38);
            numberOfBricksPerSet.put("Spider Crawler", 40);
            numberOfBricksPerSet.put("Chi Hyper Laval", 122);
          
        LegoSet legoSet = LegoSet.newBuilder()
                .setName("CHIMA")
                .setDescription("This is a list of 'Legends of Chima' lego sets, and the number of bricks per/set")
                .putAllNumberOfBricksPerSet(numberOfBricksPerSet)
                .build();
        logger.log (Level.INFO, "Number of bricks needed to build the folowing Lego Sets {0}", legoSet);  
        ConstructedLegoToy response = blockingStub.buildLego(legoSet);  
        logger.log(Level.INFO, "All LEGO Sets have been  {0} constructed!", response.getCompleted() ? "successfully" : "failed"); 
       
   return response.toString();
   }
   
    public void getLegoPiece() throws InterruptedException {
        logger.info("______________________________________________________________________");
        logger.info("***** RETURNING A STREAM OF LEGO PRODUCT LINES *****");  
        
        LegoServiceGrpc.LegoServiceStub asyncStub = LegoServiceGrpc.newStub(channel);
        CountDownLatch finishLatch = new CountDownLatch(1);   
        StreamObserver<LegoPieceRequest> requestObserver = 
                asyncStub.legoPiece(new StreamObserver<LegoPieceResponse>(){
            
            @Override
            public void onNext(LegoPieceResponse value) {   
                logger.info(value.getResult());            
            }

            @Override
            public void onError(Throwable t) {       
                 finishLatch.countDown();
            }

            @Override
            public void onCompleted() {
                logger.info("Server is done sending data");  
                finishLatch.countDown();
            }      
        });
        Arrays.asList("LEGO_CITY", 
                "LEGO_STAR_WARS", 
                "LEGO_CLASSIC", 
                "LEGO CREATOR", 
                "LEGO DUPLO", 
                "LEGO GHOSTBUSTERS", 
                "LEGO MINECRAFT")
                .forEach(
                    name -> {
                        requestObserver.onNext(LegoPieceRequest.newBuilder()
                            .setProductLine(ProductLine.newBuilder()
                                .setName(name))
                            .build());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                        }
                    }      
            );
        requestObserver.onCompleted();
    
        try {
            finishLatch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
     
   }
  
    @Override
    public boolean interested(String type) {
        return interestedService.equals(type);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> serviceInterests() {
        ArrayList<String> list = new ArrayList<>();
        list.add(interestedService);
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void serviceAdded(ServiceDescription service) {
        try {
            channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                    .usePlaintext(true)
                    .build();
            blockingStub = LegoServiceGrpc.newBlockingStub(channel);
            System.out.println("I got the information about the service, now i can call the service");
            getBuildLego();
            getLegoPiece();
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (InterruptedException ex) {
            Logger.getLogger(LegoClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getName() {
        return "Lego Client";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static void main(String[] args) throws InterruptedException{
        LegoClient client = new LegoClient("localhost", 50052);
              
    }
}
