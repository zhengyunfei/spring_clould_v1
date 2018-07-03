package com.zntg.serviceribbon;
/*
*ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为。Feign默认集成了ribbon。
ribbon 已经默认实现了这些配置bean：
IClientConfig ribbonClientConfig: DefaultClientConfigImpl
IRule ribbonRule: ZoneAvoidanceRule
IPing ribbonPing: NoOpPing
ServerList ribbonServerList: ConfigurationBasedServerList
ServerListFilter ribbonServerListFilter: ZonePreferenceServerListFilter
ILoadBalancer ribbonLoadBalancer: ZoneAwareLoadBalancer
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient//服务消费者,通过@EnableDiscoveryClient向服务中心注册
@EnableHystrix//加@EnableHystrix注解开启Hystrix
@EnableHystrixDashboard
/** 
* @Description: Spring cloud有两种服务调用方式，一种是ribbon+restTemplate，另一种是feign。在这一篇文章首先讲解下基于ribbon+rest。 
* @Author: zhengyunfei
* @Date: 2018/7/3
* @time:14:42        
*/ 
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}
	@Bean//向程序的ioc注入一个bean: restTemplate;
	@LoadBalanced//通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
