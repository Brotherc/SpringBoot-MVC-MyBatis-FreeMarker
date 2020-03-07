package com.brotherc.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.brotherc.demo.interceptor.Interceptor;
import com.brotherc.demo.interceptor.Interceptor2;

@Configuration
public class WebMvcConf extends WebMvcConfigurerAdapter {

	@Autowired
	private Interceptor interceptor;
	
	@Autowired
	private Interceptor2 interceptor2;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry){
	    registry.addInterceptor(interceptor).excludePathPatterns("/a").addPathPatterns("/**");
	    registry.addInterceptor(interceptor2).addPathPatterns("/a/b");
        super.addInterceptors(registry);
	}

	
}
