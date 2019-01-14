package com.medica.consumerdemo.method;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Create by xiang on 2019/1/14
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{
    @Override
    public String hello(@RequestParam(value = "name")String name) {
        return "hello" +name+", this messge send failed ";
    }
}
