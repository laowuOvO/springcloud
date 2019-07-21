package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by laowuOvO on 2019/7/20.
 */
@Controller
public class DisCoveryServerContorller {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("hello")
    public String discoveryServer(){
        return restTemplate.getForObject("http://DEPT/dept",String.class);
    }

    @ResponseBody
    @RequestMapping("he")
    public String helloHys(){
        return helloService.hello();
    }
}
