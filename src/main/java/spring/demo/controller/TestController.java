package spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.demo.configuration.TestConfiguration;
import spring.demo.greeter.Greeter;

@RestController
public class TestController {

    @Autowired
    private Greeter greeter;

    @GetMapping("/api/test")
    public String get(){
        return greeter.getFormat();
    };

}
