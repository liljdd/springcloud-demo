package com.ant.serviceribbon.controller;

import com.ant.serviceribbon.service.HelloService;
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
    @Autowired
    HelloService helloService;

    /**
     * http://localhost:8764/hi?name=ant
     *
     * @param name
     * @return
     */
    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
