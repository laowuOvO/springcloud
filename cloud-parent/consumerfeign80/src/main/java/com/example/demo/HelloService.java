package com.example.demo;

import com.example.api.DiscoveryService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by laowuOvO on 2019/7/20.
 */
@FeignClient(value = "dept")
public interface HelloService extends DiscoveryService{
}
