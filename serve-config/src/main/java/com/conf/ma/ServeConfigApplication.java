package com.conf.ma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServeConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeConfigApplication.class, args);
	}

}
