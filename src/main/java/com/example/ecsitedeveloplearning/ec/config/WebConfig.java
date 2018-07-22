package com.example.ecsitedeveloplearning.ec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableWebMvc
public class WebConfig {

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	       registry.addResourceHandler(
	               "/webjars/**",
	               "/img/**",
	               "/css/**",
	               "/js/**",
	               "/images/**")
	               .addResourceLocations(
	                       "classpath:/META-INF/resources/webjars/",
	                       "classpath:/static/img/",
	                       "classpath:/static/css/",
	                       "classpath:/static/js/",
	                       "file:images/");
	   }
}
