package com.ant.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    /**
     * 从config-service获取git上的配置文件：
     * 1. 配置文件为bootstrap.yml（bootstrap.yml的优先级级比application.yml高，所以会先去github配置中心获取信息）
     * 2. github上的配置文件的名字符合规则，{application}为spring.application.name的值
     */
    @Value("${foo}")
    String foo;

    /**
     * http://localhost:8882/hi
     */
    @RequestMapping(value = "/hi")
    public String hi() {
        System.out.println("===========" + foo);
        return foo;
    }
}
