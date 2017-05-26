package com.example.demo.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.dto.SingleUseCouponMessage;
import com.example.demo.service.CreateDataService;

import akka.actor.AbstractActor;

@Component("CassandraActor")
@Scope("prototype")
public class CassandraActor extends AbstractActor{
	
	@Autowired
	CreateDataService createService;

	  
	@Override
	public Receive createReceive() {
		return receiveBuilder()
			      .match(SingleUseCouponMessage.class, singleUseCoupon -> {
			    	 createService.createSingleUseCoupon(singleUseCoupon);
			        }).build();
			      
	}

}
