package com.wdl.doo.dubbo;

import com.alibaba.dubbo.config.annotation.Service;

@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloService implements  IHelloService{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
