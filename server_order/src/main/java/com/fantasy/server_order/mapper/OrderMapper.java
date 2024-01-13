package com.fantasy.server_order.mapper;

import com.fantasy.pojo.Order;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {
    /**
     * 根据订单id查询订单数据
     * @param oid
     * @return
     */
    @Select("select * from tb_order where id = #{oid}")
    Order findOrderById(Integer oid);

}
