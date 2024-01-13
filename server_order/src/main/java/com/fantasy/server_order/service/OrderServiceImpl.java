package com.fantasy.server_order.service;

import com.fantasy.pojo.Order;
import com.fantasy.pojo.User;
import com.fantasy.server_order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    //发起远程调用
    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Order findOrderById(Integer oid) {
//       查询订单数据
        Order order = orderMapper.findOrderById(oid);

//      发起远程调用查询用户数据
        User user = restTemplate.getForObject("http://userserver/user/" + order.getUserId(), User.class);
//      将查询的用户属性封装到order中
        order.setUser(user);
        return order;
    }
}
