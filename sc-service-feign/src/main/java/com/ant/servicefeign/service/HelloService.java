package com.ant.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过@FeignClient（“服务名”），来指定调用哪个服务
 * @date 18/08/29
 */
@FeignClient(value = "sc-service-hi")
public interface HelloService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiService(@RequestParam(value = "name") String name);
}
