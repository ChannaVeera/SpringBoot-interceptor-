package com.springbootinterceptor.in.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class SpringBootInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("in pre handle method ");
		/* request.setAttribute("name", "Channaveera"); */
		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		/*
		 * String blogName = (String) request.getAttribute("name"); // We are adding
		 * some modelAndView objects here and will use it in view jsp.
		 * modelAndView.addObject("name", blogName);
		 * modelAndView.addObject("authorName", "Joker");
		 * System.out.println("in post handle method ");
		 */
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		/*
		 * String blogName = (String) request.getAttribute("name"); String authorName =
		 * (String) request.getAttribute("authorName");
		 * System.out.println("Request URL::" + request.getRequestURL().toString());
		 * System.out.println("Blog name : " + blogName);
		 * System.out.println("Author Name : " + authorName);
		 * System.out.println("in after Completion");
		 */
	}

}
