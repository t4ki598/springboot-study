package com.ldr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 类 描 述：TODO
 * 创建时间：2020-04-08 13:48
 * 创 建 人：t4ki
 */

//使用WebMvcConfigurer可以扩展WebMVC功能
@Configuration
public class mvcconfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送 /ldr 请求来到 test 页面
        registry.addViewController("/ldr").setViewName("test");
    }
}
