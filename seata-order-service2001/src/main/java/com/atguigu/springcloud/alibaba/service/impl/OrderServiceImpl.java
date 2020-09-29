package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.OrderDao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author QY
 * @version 1.0
 * @date 2020/9/28 13:29
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    @Resource
    private OrderDao orderDao;

    @Override
    @GlobalTransactional(name = "fsp_tx_group",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------>新建订单");
        orderDao.create(order);

        log.info("---->订单微服务开始调用库存，做扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----->订单微服务开始调用库存，做扣减end");

        log.info("---->账户微服务做扣减");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("---->账户微服务做扣减end");

        //4修改订单的状态  0----》1   代表完成
        log.info("---->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("---->修改订单状态结束");

        log.info("订单结束 哈哈");
    }
}
