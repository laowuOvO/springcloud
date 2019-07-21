package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by laowuOvO on 2019/7/20.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String hello(){
        return restTemplate.getForObject("http://dept/dept",String.class);
    }

    public String fallback(){
        return "error";
    }
}
