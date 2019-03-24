package com.yikai.retiredsoldieradmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class RetiredsoldierAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetiredsoldierAdminApplication.class, args);
    }

}
