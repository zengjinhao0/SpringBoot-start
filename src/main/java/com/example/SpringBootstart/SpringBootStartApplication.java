package com.example.SpringBootstart;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//所有的springboot application启动类都需要在类级别上加上
@ComponentScan(basePackages = {"com.example"})//扫描Spring注解的包
@MapperScan("com.example.SpringBootstart")//扫描mybaits的mapper注解 这个很重要，如果不配置这个会报找不到bean错误
public class SpringBootStartApplication {
	//后续可以把一些初始化的动作放到该类中进行
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStartApplication.class, args);
	}
}
