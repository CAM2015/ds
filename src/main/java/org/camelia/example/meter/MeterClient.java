/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camelia.example.meter;

import client.ServiceDescription;
import client.ServiceObserver;
import client.jmDNSServiceTracker;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author camel
 */
public class MeterClient implements ServiceObserver{
    private static final Logger logger = Logger.getLogger(MeterClient.class.getName());
    
    private ManagedChannel channel;
    private MeterServiceGrpc.MeterServiceBlockingStub blockingStub;
    private final String interestedService;
    
    public MeterClient(String host, int port) {
        interestedService = "_meter._udp.local.";
        jmDNSServiceTracker clientManager = jmDNSServiceTracker.getInstance();
        clientManager.register(this);
        serviceAdded(new ServiceDescription("3.82.212.160", 50024));
    }
    
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    
    String getFunds(){
        logger.info("**************************************");
        logger.info("*****Attempting NOT TO ADD funds to the meter...*****"); 
        FundsAdded fundsAddedFirst = FundsAdded.newBuilder()
                .setAmount(0)
                .setFromAccountId(1)
                .setToAccountId(2)
                .build();
        logger.log (Level.INFO,  "FUNDS: " + fundsAddedFirst);  
        FundsAddedConfirmation response1 = blockingStub.funds(fundsAddedFirst);
        logger.log(Level.INFO, "Response: " + response1); 
        
        logger.info("**************************************");
        logger.info("*****Attempting TO ADD funds to the meter...*****"); 
        FundsAdded fundsAddedSecond = FundsAdded.newBuilder()
                .setAmount(115)
                .setFromAccountId(1)
                .setToAccountId(2)
                .build();
        logger.log (Level.INFO, "FUNDS: " + fundsAddedSecond);  
        FundsAddedConfirmation response2 = blockingStub.funds(fundsAddedSecond);
        logger.log(Level.INFO, "Response: " + response2);     
        
        logger.info("finished adding the funds");
        return response1.toString();   
        
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
        blockingStub = MeterServiceGrpc.newBlockingStub(channel);
        System.out.println("I got the information about the service, now i can call the service");
        getFunds();       
    }

    @Override
    public String getName() {
        return "Meter Client";
    }

    @Override
    public void switchService(String name) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public static void main(String[] args) throws InterruptedException{
        MeterClient client = new MeterClient("localhost", 50024);
                 
    }
}
