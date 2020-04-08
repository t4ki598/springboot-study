package com.ldr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot03AutoconfigApplication {

    public static void main(String[] args) {
        System.out.println("自动配置原理");
        SpringApplication.run(Springboot03AutoconfigApplication.class, args);
    }

}
