package com.ant.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableConfigServer注解开启配置服务器的功能
 */
@SpringBootApplication
//@EnableEurekaServer
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApplication {

    /**
     * http://localhost:8769/eureka-client/dev
     */
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
