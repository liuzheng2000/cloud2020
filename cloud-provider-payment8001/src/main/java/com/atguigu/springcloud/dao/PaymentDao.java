package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
@Mapper
public interface PaymentDao {
    /**
     * aa
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 查找
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
