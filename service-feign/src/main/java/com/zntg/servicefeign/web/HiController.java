package com.zntg.servicefeign.web;

import com.zntg.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: zntg_clould_v1
 * @description:
 * @author: zhengyunfei
 * @create: 2018-07-03 11:08
 **/
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    /**
    * @Description: sayHi api接口
    * @Author: zhengyunfei qq群号:541122375
    * @Date: 2018/7/3
    * @time:11:09
    */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
