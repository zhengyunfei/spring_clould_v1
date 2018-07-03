package com.zntg.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: zntg_clould_v1
 * @description:
 * @author: zhengyunfei
 * @create: 2018-07-03 09:18
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-SERVICE-HI/hi?name="+name,String.class);
    }
}