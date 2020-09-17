package com.atguigu.springcloud.lb;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author QY
 * @version 1.0
 * @date 2020/9/15 19:45
 */
@Component
public class MyLB implements LoadBalancer {

     private AtomicInteger atomicInteger = new AtomicInteger(0);

     public final  int getAndIncrement(){
         int current;
         int next;
        do {
            current = this.atomicInteger.get();
            System.out.println(current);
            next = current >= 2147483647? 0 : current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问next:"+next);
        return next;
     }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        System.out.println(serviceInstances.get(index));
        return serviceInstances.get(index);
    }
}
