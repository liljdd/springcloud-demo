package com.ant.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过@FeignClient（“服务名”），来指定调用哪个服务
 * value指定调用服务 fallback指定调用失败使用的类
 * Feign是自带断路器的，没有默认打开,需在配置文件打开后使用fallback
 * @date 18/08/29
 */
@FeignClient(value = "sc-service-hi",fallback = HelloServiceImpl.class)
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiService(@RequestParam(value = "name") String name);
}
