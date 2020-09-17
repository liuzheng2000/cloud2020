package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author QY
 * @version 1.0
 * @date 2020/9/16 19:39
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall backpaymentInfo_OK ,/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall backpaymentInfo_TimeOut ,/(ㄒoㄒ)/~~";
    }
}
