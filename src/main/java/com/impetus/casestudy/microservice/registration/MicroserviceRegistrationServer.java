package com.impetus.casestudy.microservice.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceRegistrationServer {

  public static void main(String[] args) {
    // Finds yml file for booting - server.yml
    System.setProperty("spring.config.name", "server");
    SpringApplication.run(MicroserviceRegistrationServer.class, args);
  }
}