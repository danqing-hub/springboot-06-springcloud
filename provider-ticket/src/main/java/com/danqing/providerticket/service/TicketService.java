package com.danqing.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @author 丹青
 * @date 2020/4/29-19:16
 */
@Service
public class TicketService {

    public String getTicket(){
        System.out.println("8002");
        return "《厉害了，我的国》";
    }
}
