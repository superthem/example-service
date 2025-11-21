package com.exampleaaa.exampleeee.domain.impl;

import com.exampleaaa.exampleeee.api.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public Boolean sayHello(String name) {
        System.out.println("Hello！");
        return true;
    }
}
