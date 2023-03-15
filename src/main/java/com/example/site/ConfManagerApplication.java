package com.example.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeviceManagerApplication extends SpringBootServletInitializer{

    public static void main(String[] args){
        SpringApplication.run(DeviceManagerApplication.class, args);
    }
}
