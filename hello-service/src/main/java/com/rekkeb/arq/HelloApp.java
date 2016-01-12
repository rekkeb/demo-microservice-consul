package com.rekkeb.arq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rekkeb
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloApp {

    @Value("${environment}")
    private String env;

    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String id;

    protected HelloApp() {
    }

    @RequestMapping("/hello")
    public String home() {
        return String.format("Hello world. I am: %s, and I am in: %s", id, env);
    }

    public static void main(String[] args){

        new SpringApplicationBuilder(HelloApp.class).web(true).run(args);
    }
}
