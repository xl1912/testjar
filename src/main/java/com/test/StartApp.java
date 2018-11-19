package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

/**
 * @Describe:
 * @Auther: zhenlong.yang
 * @Date: 2018/10/17 09:44
 */
@SpringBootApplication
@RestController
public class StartApp {
    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "hello spring boot";
    }

}
