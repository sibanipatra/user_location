package com.user.location.proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class UserLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserLocationApplication.class, args);
	}

}
