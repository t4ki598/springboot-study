package com.ldr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * 类 描 述：TODO
 * 创建时间：2020-04-06 16:19
 * 创 建 人：t4ki
 */

@Controller
public class TestController {

    //查出一些数据在页面中显示
    @RequestMapping("/test")
    public String test(Map<String, Object> map){
        map.put("hello", "<h2>你好</h2>");
        map.put("users", Arrays.asList("张三", "李四", "王五"));
        return "test";
    }
}
