package com.danqing.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 丹青
 * @date 2020/4/29-20:12
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name){
        //得到url的值，转成String.class
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name+"买了"+s;
    }
}
