package com.wdl.doo.test.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wdl.doo.dubbo.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HelloServiceTest {
    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            registry = "${dubbo.registry.id}")
    private IHelloService iHelloService;

    public void sayHello() {
        log.info("sayHello");
        iHelloService.sayHello();
    }
}
