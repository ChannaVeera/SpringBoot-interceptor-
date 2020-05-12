package com.springbootinterceptor.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SpringinterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringinterceptorApplication.class, args);
	}

	@Bean
	public ViewResolver viewResolver() {
		final InternalResourceViewResolver r = new InternalResourceViewResolver();
		r.setPrefix("/WEB-INF/jsp/");
		r.setSuffix(".jsp");
		return r;
	}
}
