package com.yk.eurekafeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//通过Feign去消费服务 Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients //开启Feign的功能
public class EurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplication.class, args);
    }

}
