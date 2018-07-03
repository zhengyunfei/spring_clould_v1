package com.zntg.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @Description:  定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务。比如在代码中调用了service-hi服务的“/hi”接口，代码如下：
 * Feign中使用断路器：只需要在FeignClient的SchedualServiceHi接口的注解中加上fallback的指定类就行了
* @Author: zhengyunfei q群号:541122375
* @Date: 2018/7/3  
* @time:11:05
*/
@FeignClient(value="service-hi",fallback = SchedualServiceHiHystric .class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
