package com.ldr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类 描 述：TODO
 * 创建时间：2020-04-03 17:05
 * 创 建 人：t4ki
 */

//很多方法都需要发送一个请求，把数据直接交给浏览器而不是跳转。就写@ResponseBody在类前面
//@ResponseBody //这个类的所有方法返回的数据直接给浏览器（如果是对象转为json数据）
//@Controller
@RestController //等价于 @ResponseBody + @Controller
public class HelloController {

    //@ResponseBody //返回的字符串要写给浏览器
    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot";
    }
}
