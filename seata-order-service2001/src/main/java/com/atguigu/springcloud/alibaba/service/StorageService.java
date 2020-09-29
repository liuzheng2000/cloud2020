package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author QY
 * @version 1.0
 * @date 2020/9/28 13:32
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    /**
     * 调用库存
     * @param productId
     * @return
     */
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Integer productId,@RequestParam("count") Integer count);
}
