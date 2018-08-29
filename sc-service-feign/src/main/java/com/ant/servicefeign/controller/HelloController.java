package com.ant.servicefeign.controller;

import com.ant.servicefeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lilj
 * @date 18/08/29
 */
@RestController
public class HelloController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    HelloService helloService;

    /**
     * http://localhost:8765/hello?name=ant
     * @param name
     * @return
     */
    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
