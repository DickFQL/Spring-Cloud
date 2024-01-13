package com.fantasy.server_order.service;

import com.fantasy.pojo.Order;
import org.apache.ibatis.annotations.Select;

public interface OrderService {
    /**
     * 根据订单id查询订单数据
     * @param oid
     * @return
     */

    Order findOrderById(Integer oid);

}
