package com.nau.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nau.bean.B;
import com.nau.bean.MYBean;


//@Configuration
public class MyBeanConfiguration {
	@Bean
	public MYBean getMYBean() {
		return new MYBean();
	}
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
	
	@Bean
	public B getB() {
		return new B();
	}
}
