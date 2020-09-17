package com.scb.pod2.config.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.Generated;


@SpringBootApplication
@EnableConfigServer
public class LmaSpringConfigServerApplication {

	@Generated
	public static void main(String[] args) {
		SpringApplication.run(LmaSpringConfigServerApplication.class, args);
	}

}
