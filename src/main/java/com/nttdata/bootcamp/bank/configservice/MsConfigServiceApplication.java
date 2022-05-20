package com.nttdata.bootcamp.bank.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class MsConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConfigServiceApplication.class, args);
	}

}
