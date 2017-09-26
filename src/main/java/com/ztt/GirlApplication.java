package com.ztt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.HashSet;
import java.util.Set;

@EnableDiscoveryClient
@SpringBootApplication
public class GirlApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(GirlApplication.class);
		app.setWebEnvironment(true);
		//app.setShowBanner(false);阿萨德

		Set<Object> set = new HashSet<Object>();
		//set.add("classpath:application-dev.yaml");
		app.setSources(set);
		app.run(args);
		//SpringApplication.run(GirlApplication.class, args);
	}
}
