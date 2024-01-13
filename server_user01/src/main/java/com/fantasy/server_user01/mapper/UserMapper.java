package com.fantasy.server_user01.mapper;

import com.fantasy.pojo.Order;
import com.fantasy.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    /**
     * 根据订单id查询订单数据
     * @param uid
     * @return
     */
    @Select("select * from tb_user where id = #{uid}")
    User findUserById(Integer uid);

}
