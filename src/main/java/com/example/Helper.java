package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Helper {
	@Value("${eureka.instance.hostname}")
	String host;
	
	@Value("${eureka.client.serviceUrl.defaultZone}")
	String defaultZone;

	public void print() {
		System.out.println("Host:" + host);
		System.out.println("defaultZone:" + defaultZone);
	}
}
