package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekMain7002.class,args);
    }
}
