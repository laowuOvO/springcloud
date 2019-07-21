package com.example.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by laowuOvO on 2019/7/20.
 */
public interface DiscoveryService {

    @RequestMapping("hello4")
    public String hello4(@RequestParam("name") String name);

    @RequestMapping("hello5")
    public String hello5(@RequestHeader("name") String name, @RequestHeader("age") int age);

    @RequestMapping("hello6")
    public String hello6(@RequestBody User user);
}
