package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static com.example.demo.config.SpringExtension.SpringExtProvider;

import akka.actor.ActorSystem;

@Configuration
public class AppConfig {

	 @Autowired
	  private ApplicationContext applicationContext;

	  /**
	   * Actor system singleton for this application.
	   */
	  @Bean
	  public ActorSystem actorSystem() {
	    ActorSystem system = ActorSystem.create("AkkaJavaSpring");
	    SpringExtProvider.get(system).initialize(applicationContext);
	    return system;
	  }
}
