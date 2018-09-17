package com.akera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    //这是dev分支.......
    public static void main(String[] args) {
        System.out.println("这是dev... 分支");
        SpringApplication.run(Application.class, args);
    }
}
