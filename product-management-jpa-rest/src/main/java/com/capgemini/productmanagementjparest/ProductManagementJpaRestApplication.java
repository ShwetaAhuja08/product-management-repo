package com.capgemini.productmanagementjparest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.capgemini.training")
@EntityScan(basePackages = "com.capgemini.training.entity")
@EnableJpaRepositories(basePackages = "com.capgemini.training.dao")
public class ProductManagementJpaRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementJpaRestApplication.class, args);
	}

}
