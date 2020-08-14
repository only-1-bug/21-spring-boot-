package com.heyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.heyu.order.mapper")
public class HeyUOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeyUOrderApplication.class, args);
    }
}
