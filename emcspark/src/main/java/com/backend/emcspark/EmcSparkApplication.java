package com.backend.emcspark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.backend.emcspark", "com.backend.restbackend"})
@EntityScan("com.backend.restbackend")
public class EmcSparkApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmcSparkApplication.class, args);
	}

}
