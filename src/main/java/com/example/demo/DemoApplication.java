package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);	}
@Bean
	public CommandLineRunner CommandLineRunner(ApplicationContext ctx){
	return args-> {
		System.out.println("For spring inspection ************************************************************************");
		String[] beanNames=ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName: beanNames){
			System.out.println(beanName);
		}
	};
	}
}
