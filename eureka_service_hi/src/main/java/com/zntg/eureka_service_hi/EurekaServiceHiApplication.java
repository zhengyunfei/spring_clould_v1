/**
 spring cloud 为开发人员提供了快速构建分布式系统的一些工具，
 包括配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、分布式会话等等。它运行环境简单，
 可以在开发人员的电脑上跑。另外说明spring cloud是基于springboot的，所以需要开发中对springboot有一定的了解，
 在微服务架构中，业务都会被拆分成一个独立的服务，服务与服务的通讯是基于http restful的。
 Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign
 一、ribbon简介
 Ribbon is a client side load balancer which gives you a lot of control over the behaviour of HTTP and TCP clients.
 Feign already uses Ribbon,
 so if you are using @FeignClient then this section also applies.
 —–摘自官网
 ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon。
 */
package com.zntg.eureka_service_hi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Description: SpringCloud 教程 | 第二篇： 服务消费者(rest+ribbon)
 * 工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；
 * 并且向程序的ioc注入一个bean: restTemplate;
 * 并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
 * @Author: zhengyunfei qq群号:541122375
 * @Date: 2018/7/3
 * @time:10:36
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceHiApplication.class, args);
	}
	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi "+name+",i am from port:" +port;
	}
}
