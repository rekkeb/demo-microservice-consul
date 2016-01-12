package com.rekkeb.zuulserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author rekkeb
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServer {

    protected ZuulServer() {
    }

    public static void main(String[] args){

        new SpringApplicationBuilder(ZuulServer.class).web(true).run(args);
    }
}
