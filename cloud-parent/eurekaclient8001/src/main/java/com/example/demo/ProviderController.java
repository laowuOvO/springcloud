package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by laowuOvO on 2019/7/20.
 */
@RestController
public class ProviderController {

    @RequestMapping("dept")
    public String dept(){
        return "{\"deptName\",\"测试部门名称server8001\"}";
    }

    @RequestMapping("hello1")
    public String hello1(@RequestParam String name){
        return "server8001hello"+name;
    }

    @RequestMapping("hello2")
    public String hello2(@RequestHeader String name,@RequestHeader int age){
        return "server8001hello"+name;
    }

    @RequestMapping("hello3")
    public String hello3(@RequestBody User user){
        return "server8001hello"+user.getName()+","+user.getAge();
    }



}
