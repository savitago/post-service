package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class PostServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostServiceApplication.class, args);
	}

}