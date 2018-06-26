package com.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication 
{
    public static void main( String[] args )
    {
        System.out.println("My first spring boot program...");
        SpringApplication.run(MainApplication.class, args);
    }
}
