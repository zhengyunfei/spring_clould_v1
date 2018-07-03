package com.zntg.servicefeign.service;

/**
 * @program: SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中，代码如下：
 * @description:断路器返回类
 * @author: zhengyunfei
 * @create: 2018-07-03 14:55
 **/
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
