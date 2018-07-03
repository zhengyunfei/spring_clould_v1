/**
 spring cloud 为开发人员提供了快速构建分布式系统的一些工具，
 包括配置管理、服务发现、断路器、路由、微代理、事件总线、全局锁、决策竞选、分布式会话等等。它运行环境简单，
 可以在开发人员的电脑上跑。另外说明spring cloud是基于springboot的，所以需要开发中对springboot有一定的了解，
*/ 
package com.zntg.eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/** 
* @Description: SpringCloud 教程 | 第一篇： 服务的注册与发现（Eureka）
 * 在这里，我们需要用的的组件上Spring Cloud Netflix的Eureka ,eureka是一个服务注册和发现模块。
 * 启动一个服务注册中心，只需要一个注解@EnableEurekaServer
 * eureka是一个高可用的组件，它没有后端缓存，每一个实例注册之后需要向注册中心发送心跳（因此可以在内存中完成），在默认情况下erureka server也是一个eureka client ,必须要指定一个 server
* @Author: zhengyunfei qq群号:541122375
* @Date: 2018/7/3  
* @time:10:36        
*/ 
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
