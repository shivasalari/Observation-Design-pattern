package com.example.eventhandler;

import com.example.eventhandler.core.EventEmitter;
import com.example.eventhandler.service.*;


public class App {

    public static void main(String[] args) {
    	
		final EventEmitter eventEmitter = new EventEmitter();
    	eventEmitter.addSubscriber(new EventConsumer());
    	
    	UserProfileEventProducer userProfileEventProducer = new UserProfileEventProducer(eventEmitter);
    	WalletEventProducer walletEventProducer = new WalletEventProducer(eventEmitter);
       
    	eventEmitter.addSubscriber(userProfileEventProducer);
    	eventEmitter.addSubscriber(walletEventProducer);
    	
    	userProfileEventProducer.produceEvent();
    	walletEventProducer.produceEvent();
    }

}
