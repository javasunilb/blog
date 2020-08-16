package com.skb.ibatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.skb.ibatis.mapper")
public class SpringIBatisApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringIBatisApplication.class, args);
	}
}