package com.example.demo;

import com.example.api.DiscoveryService;
import com.example.api.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by laowuOvO on 2019/7/20.
 */
@RestController
public class HelloController implements DiscoveryService {

    @Override
    public String hello4(@RequestParam("name") String name) {
        return "server8002hello"+name;
    }

    @Override
    public String hello5(@RequestHeader("name") String name, @RequestHeader("age") int age) {
        return "server8002hello"+name;
    }

    @Override
    public String hello6(@RequestBody User user) {
        return "server8002hello"+user.getName()+","+user.getAge();
    }
}
