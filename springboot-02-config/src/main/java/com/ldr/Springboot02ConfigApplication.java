package com.ldr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot不推荐添加bean配置文件的方法，推荐使用全注解
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Springboot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02ConfigApplication.class, args);
    }

}
