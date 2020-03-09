package com.jby.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 控制器类
@Controller
@RequestMapping(path="/user")
public class HelloController {

    /**
     * 入门案例
     * @return
     */
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello StringMVC");
        return "success";
    }

    /**
     * RequestMapping注解
     * params = {"username"} request中必须包含username 字段
     * @return
     */
    @RequestMapping(value="/testRequestMapping",params = {"username"},headers = {"Accept"})
    public String testRequestMapping(String username){
        System.out.println(username);
        System.out.println("测试RequestMapping注解...");
        return "success";
    }

}
