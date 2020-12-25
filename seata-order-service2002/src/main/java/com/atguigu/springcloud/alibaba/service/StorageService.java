package com.atguigu.springcloud.alibaba.service;


/**
 * @author Administrator
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}

