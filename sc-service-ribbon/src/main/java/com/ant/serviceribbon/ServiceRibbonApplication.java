package com.ant.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * SpringCLoud中的“Discovery Service”有多种实现，比如：eureka, consul, zookeeper。
 *
 * 1，@EnableDiscoveryClient 注解是基于 spring-cloud-commons依赖，并且在classpath中实现；
 * 2，@EnableEurekaClient 注解是基于 spring-cloud-netflix依赖，只能为eureka作用；
 * 简单的说，就是如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient，
 * 如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    /**
     * 向程序的ioc注入一个bean: restTemplate;
     * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
