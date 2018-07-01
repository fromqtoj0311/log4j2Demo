package com.fromqtoj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.fromqtoj.mapper")
@SpringBootApplication
public class Log4j2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Log4j2DemoApplication.class, args);
	}
}
