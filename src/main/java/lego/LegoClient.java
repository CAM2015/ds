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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.camelia.example.lego.LegoSet;
import org.camelia.example.lego.ConstructedLegoToy;
import org.camelia.example.lego.LegoServiceGrpc;


public class LegoClient implements ServiceObserver {
    private static final Logger logger = Logger.getLogger(LegoClient.class.getName());
    
    private ManagedChannel channel;
    private LegoServiceGrpc.LegoServiceBlockingStub blockingStub;
    private String interestedService;
    
    public LegoClient(String host, int port) {
        interestedService = "_lego._udp.local.";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
    }
    
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

   public void getBuildLego() {
        logger.info("attempting to build lego...");  
        HashMap<String,Integer>numberOfBricksPerSet = new HashMap<>();
            numberOfBricksPerSet.put("Brickmaster Legends of CHIMA: The Quest for Chi parts", 187);
            numberOfBricksPerSet.put("Ewar's Acro Fighter", 33);
            numberOfBricksPerSet.put("Winzar's Pack Patrol", 38);
            numberOfBricksPerSet.put("Spider Crawler", 40);
            numberOfBricksPerSet.put("Chi Hyper Laval", 122);
          
        LegoSet legoSet = LegoSet.newBuilder()
                .setName("CHIMA")
                .setDescription("This is a list of Legends of Chima Lego Sets, based on LEGO's Legends of Chima series of LEGO sets")
                .putAllNumberOfBricksPerSet(numberOfBricksPerSet)
                .build();
        logger.info ("Number of bricks needed to build the folowing Lego Sets " + legoSet);  
        ConstructedLegoToy response = blockingStub.buildLego(legoSet);  
        logger.info("All LEGO Sets have been  " + (response.getCompleted() ? "successfully" : "failed") + " constructed!"); 
    }
  
    
    public boolean interested(String type) {
        return interestedService.equals(type);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> serviceInterests() {
        ArrayList<String> list = new ArrayList<String>();
        list.add(interestedService);
        return list;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void serviceAdded(ServiceDescription service) {
        channel = ManagedChannelBuilder.forAddress(service.getAddress(), service.getPort())
                .usePlaintext(true)
                .build();
        blockingStub = LegoServiceGrpc.newBlockingStub(channel);
        System.out.println("I got the information about the service, now i can call the service");
        getBuildLego();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return "Lego Client";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void switchService(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static void main(String[] args) throws InterruptedException{
        LegoClient client = new LegoClient("localhost", 50052);
                 
    }
    
}
