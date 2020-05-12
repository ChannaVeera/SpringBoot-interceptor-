package com.springbootinterceptor.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class ControllerClass {

	
	@GetMapping("/hello")
	    public String intercept() {
	        System.out.println("this is controller, request path is intercept");
	        return "hello";
	    }

	    @RequestMapping("/not-intercept")
	    public String notIntercept() {
	        System.out.println("this is controller, request path is not intercept");
	        return "hello";
	    }
}
