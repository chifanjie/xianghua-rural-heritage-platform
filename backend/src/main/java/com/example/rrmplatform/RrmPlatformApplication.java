package com.example.rrmplatform;


import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableMPP
@SpringBootApplication
public class RrmPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(RrmPlatformApplication.class, args);
    }

}