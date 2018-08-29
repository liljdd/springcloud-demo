package com.ant.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients注解开启Feign的功能
 *
 * Feign是一个声明式的伪Http客户端，它使得写Http客户端变得更简单:
 * 1. Feign 采用的是基于接口的注解
 * 2. Feign 整合了ribbon，具有负载均衡的能力
 * 3. 整合了Hystrix，具有熔断的能力
 */
@EnableEurekaClient
//@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}
