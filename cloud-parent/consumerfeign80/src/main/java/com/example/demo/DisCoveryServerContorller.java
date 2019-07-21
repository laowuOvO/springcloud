package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by laowuOvO on 2019/7/20.
 */
@RestController
public class DisCoveryServerContorller {

    @Autowired
    private DisCoveryServerDAO dao;
    @Autowired
    private HelloService helloService;

    @RequestMapping("discoveryServer")
    public String discoveryServer(){
        return dao.dept();
    }

    @RequestMapping("hello1")
    public String hello(){
        StringBuffer sb = new StringBuffer();
        sb.append(dao.hello1("老五")).append("\n");
        sb.append(dao.hello2("老五",22)).append("\n");
        sb.append(dao.hello3(new User("老五",22))).append("\n");
        return sb.toString();
    }

    @RequestMapping("helloapi")
    public String helloapi(){
        StringBuffer sb = new StringBuffer();
        sb.append(helloService.hello4("老五")).append("\n");
        sb.append(helloService.hello5("老五",22)).append("\n");
        sb.append(helloService.hello6(new com.example.api.User("老五",22))).append("\n");
        return sb.toString();
    }
}
