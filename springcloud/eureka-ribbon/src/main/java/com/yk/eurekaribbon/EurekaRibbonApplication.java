package com.yk.eurekaribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//RestTemplate+Ribbon去消费服务
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient //向服务中心注册
@EnableHystrix   //注解开启Hystrix断路器
public class EurekaRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced //表明这个restRemplate开启负载均衡的功能
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
