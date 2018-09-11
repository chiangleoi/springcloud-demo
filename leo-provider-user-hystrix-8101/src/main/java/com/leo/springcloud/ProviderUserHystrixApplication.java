package com.leo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient // 注册为 Eureka 客户端
@EnableHystrix // 开启 hystrix
public class ProviderUserHystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProviderUserHystrixApplication.class, args);
	}

}
