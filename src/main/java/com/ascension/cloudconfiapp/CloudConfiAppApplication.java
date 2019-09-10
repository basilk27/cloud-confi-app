package com.ascension.cloudconfiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfiAppApplication {

    public static void main( String[] args ) {
        SpringApplication.run( CloudConfiAppApplication.class, args );
    }

}
