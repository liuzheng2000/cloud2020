package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author QY
 * @version 1.0
 * @date 2020/9/28 13:31
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
        /**
         * 用户
         * @param userId
         *@param money
         * @return
         */
        @PostMapping(value = "/account/decrease")
        CommonResult decrease(@RequestParam("userId") Integer userId,@RequestParam("money") Integer money);
}
