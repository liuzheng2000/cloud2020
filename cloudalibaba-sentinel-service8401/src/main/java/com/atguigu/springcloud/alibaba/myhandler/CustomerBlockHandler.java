package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author QY
 * @version 1.0
 * @date 2020/9/27 13:57
 */
public class CustomerBlockHandler {


    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(4444,"客户自定义,BlockException",new Payment(2020L,"serial003"));
    }


    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444,"客户自定义222222,BlockException",new Payment(2020L,"serial003"));
    }

}
