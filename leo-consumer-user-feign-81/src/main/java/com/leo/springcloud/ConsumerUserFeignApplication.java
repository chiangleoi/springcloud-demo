package com.leo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient // Eureka 客户端
@EnableFeignClients(basePackages = {"com.leo.springcloud.service"}) // 扫描 Feign 客户端
public class ConsumerUserFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerUserFeignApplication.class, args);
	}
	
}
