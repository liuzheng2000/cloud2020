package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author QY
 * @version 1.0
 * @date 2020/9/28 13:11
 */
@Mapper
public interface OrderDao {

    /**
     *  //1 新建订单
     * @param order
     */
    void create(Order order);


    /**
     * 2修改订单状态
     */
    void update(@Param("userId") Integer userId,@Param("status") Integer status);
}
