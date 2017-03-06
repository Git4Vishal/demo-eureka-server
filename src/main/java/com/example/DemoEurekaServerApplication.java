package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

//import com.github.vanroy.cloud.dashboard.config.EnableCloudDashboard;

//@EnableCloudDashboard
@EnableEurekaServer
@SpringBootApplication
@PropertySource("classpath:application.yml")
public class DemoEurekaServerApplication {
	
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoEurekaServerApplication.class, args);
		
		Helper pi = ctx.getBean(Helper.class);
		pi.print();
				
	}	
}