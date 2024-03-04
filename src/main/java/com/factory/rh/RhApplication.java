package com.factory.rh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class RhApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhApplication.class, args);
    }

}
