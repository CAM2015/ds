/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meter;

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
import org.camelia.example.meter.FundsAdded;
import org.camelia.example.meter.FundsAddedConfirmation;
import org.camelia.example.meter.MeterServiceGrpc;

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
    }
    
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    
    String getFunds(){
        logger.info("attempting TO ADD funds to the meter..."); 
        FundsAdded fundsAdded = FundsAdded.newBuilder()
                .setAmount(115)
                .setFromAccountId(1)
                .setToAccountId(2)
                .build();
       logger.log (Level.INFO, "FUNDS: " + fundsAdded);  
        FundsAddedConfirmation response = blockingStub.funds(fundsAdded);
        logger.log(Level.INFO, "Response: " + response);     
        
        
        logger.info("attempting TO ADD funds to the meter..."); 
        FundsAdded fundsAdded1 = FundsAdded.newBuilder()
                .setAmount(0)
                .setFromAccountId(1)
                .setToAccountId(2)
                .build();
       logger.log (Level.INFO,  "FUNDS: " + fundsAdded1);  
        FundsAddedConfirmation response2 = blockingStub.funds(fundsAdded1);
        logger.log(Level.INFO, "Response: " + response2);     
      
        return response.toString();
       
    }
    
    
    @Override
    public boolean interested(String type) {
        return interestedService.equals(type);
    }

    @Override
    public List<String> serviceInterests() {
        ArrayList<String> list = new ArrayList<>();
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        MeterClient client = new MeterClient("localhost", 50054);
                 
    }
}
