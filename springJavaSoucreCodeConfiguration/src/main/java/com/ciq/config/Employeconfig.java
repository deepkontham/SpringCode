package com.ciq.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.ciq.dao.Employeeimpl;

@Configurable
@ComponentScan(basePackages = "com.ciq.*")
public class Employeconfig {
	@Bean
	public Employeeimpl empl() {
		return new Employeeimpl();
		
	}

}
