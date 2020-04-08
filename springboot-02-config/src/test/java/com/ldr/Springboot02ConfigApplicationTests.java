package com.ldr;

import com.ldr.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void HelloServiceTest(){
        boolean a = ioc.containsBean("helloService");
        System.out.println(a);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
