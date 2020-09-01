package com.scb.pod2.config.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LmaSpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmaSpringConfigServerApplication.class, args);
	}

}
