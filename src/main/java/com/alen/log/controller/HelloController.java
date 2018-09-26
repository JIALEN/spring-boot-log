package com.alen.log.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author alen
 * @create 2018-08-27 11:22
 **/
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        //加上@Slf4j，直接使用log变量
        log.info("打印日志");
        return "Hello";
    }
}
