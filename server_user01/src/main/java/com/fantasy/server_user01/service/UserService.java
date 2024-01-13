package com.fantasy.server_user01.service;

import com.fantasy.pojo.Order;
import com.fantasy.pojo.User;

public interface UserService {
    /**
     * 根据订单id查询订单数据
     * @param uid
     * @return
     */


    User findUserById(Integer uid);
}
