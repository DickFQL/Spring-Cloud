package com.fantasy.server_order.controller;


import com.fantasy.pojo.Order;
import com.fantasy.server_order.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{oid}")
    @ResponseBody
    public Order findOrderById(@PathVariable("oid") Integer oid){

        return orderService.findOrderById(oid);
    }

}
