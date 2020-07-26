package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class ServiceDiscovery2 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscovery2.class, args);
    }

    @GetMapping(value = "/")
    public String home() {
        return "Home page - Service Discovery 2";
    }

    @GetMapping(value = "/about")
    public String about() {
        return "About project - Service Discovery 2";
    }
}
