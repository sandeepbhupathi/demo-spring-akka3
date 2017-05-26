package com.example.demo;

import static com.example.demo.config.SpringExtension.SpringExtProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SingleUseCouponMessage;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

@RestController
@RequestMapping("/test")
public class SampleRest {

	@Autowired
	private ActorSystem system;
	@RequestMapping("/callAkka")
	public String testAkka(@RequestParam("actorname") String actorName,
			@RequestParam("promoId") String promoId,
			@RequestParam("noOfCoupons") int noOfCoupons ){
		
		SingleUseCouponMessage singleUse = 
				new SingleUseCouponMessage(actorName, noOfCoupons, promoId);
		
	    ActorRef counter = system.actorOf(
	      SpringExtProvider.get(system).props("CassandraActor"), actorName);

	    counter.tell(singleUse, null);
	    
		return "SUCCESS";
	}
}
