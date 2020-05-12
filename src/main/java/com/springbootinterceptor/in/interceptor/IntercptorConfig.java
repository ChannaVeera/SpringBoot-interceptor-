package com.springbootinterceptor.in.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class IntercptorConfig extends WebMvcConfigurationSupport {
	@Autowired
	private SpringBootInterceptor interceptor;

//	public void addInterceptorss(InterceptorRegistry registry) {
//		registry.addInterceptor(new SpringBootInterceptor()).addPathPatterns("/hello");
//	}

	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistry) {

		System.out.println("this method will get invoked by container while deployment");
		System.out.println("value of interceptor is " + interceptor);
		// adding custom interceptor
		interceptorRegistry.addInterceptor(interceptor);
	}

}
