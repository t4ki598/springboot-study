package com.ldr.config;

import com.ldr.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 类 描 述：TODO
 * 创建时间：2020-04-05 13:37
 * 创 建 人：t4ki
 */

//在配置文件中用<bean></bean>标签添加组件
@Configuration//指明当前类是配置类，就是来替代之前的Spring配置文件
public class MyAppConfig {
    //将方法的返回值添加到容器中，容器中组件的默认id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("可以用配置类给文件添加属性了");
        return new HelloService();
    }
}
