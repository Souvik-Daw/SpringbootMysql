package com.example.MysqlConnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlConnectApplication.class, args);
		System.out.println("Server Stated For connection at 8080");
	}

}
