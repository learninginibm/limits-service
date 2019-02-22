package com.learn.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.learn.microservice.config.JpaConfiguration;

import lombok.extern.slf4j.Slf4j;

@Import(JpaConfiguration.class)
@SpringBootApplication
@Slf4j
public class Application {

	public static void main(String[] args) {
		log.info("Application is about to start");
		SpringApplication.run(Application.class, args);
	}
}
