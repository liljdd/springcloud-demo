package com.ant.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * @author lilj
 * @date 18/08/29
 */
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String hiService(String name) {
        return "sorry," + name;
    }
}
