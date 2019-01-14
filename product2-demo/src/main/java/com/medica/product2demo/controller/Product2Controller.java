package com.medica.product2demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by xiang on 2019/1/14
 */
@RestController
public class Product2Controller {
    @RequestMapping("/hello")
    public String index(@RequestParam(value = "name")String name){
        return "hello "+name+"，this is producer 2  send first messge";
    }
}
