package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by laowuOvO on 2019/7/20.
 */
@FeignClient("dept")
public interface DisCoveryServerDAO {

    @RequestMapping("dept")
    String dept();

    @RequestMapping("hello1")
    public String hello1(@RequestParam("name") String name);

    @RequestMapping("hello2")
    public String hello2(@RequestHeader("name") String name, @RequestHeader("age") int age);

    @RequestMapping("hello3")
    public String hello3(@RequestBody User user);
}
