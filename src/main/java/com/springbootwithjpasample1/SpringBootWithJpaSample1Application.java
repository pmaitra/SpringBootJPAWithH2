package com.springbootwithjpasample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableJpaRepositories
@EnableCaching
public class SpringBootWithJpaSample1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJpaSample1Application.class, args);
	}
}
