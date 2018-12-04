package com.lab7arsw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab7Arsw {
    @Autowired
    private CustomerRepository repository;
    
    public static void main(String[] args) {
        SpringApplication.run(Lab7Arsw.class, args);
    }
}
