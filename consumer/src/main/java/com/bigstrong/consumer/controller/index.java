package com.bigstrong.consumer.controller;

import com.bigstrong.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User: BigStrong
 * Date: 2021/3/25
 * Description: index
 */
@RestController
@RequestMapping("/index")
public class index {

    @Resource
    DemoService demoService;

    @RequestMapping("/sayHello")
    public String hello(String name){

        String str = demoService.sayHello(name);

        return str;
    }
}
