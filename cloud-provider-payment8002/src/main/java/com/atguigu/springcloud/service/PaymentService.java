package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public interface PaymentService {
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
