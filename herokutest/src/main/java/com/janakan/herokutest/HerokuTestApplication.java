package com.janakan.herokutest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class HerokuTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(HerokuTestApplication.class, args);
	}
}
