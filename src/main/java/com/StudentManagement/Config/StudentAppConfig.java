package com.StudentManagement.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.StudentManagement"})
public class StudentAppConfig implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
		viewResolve.setPrefix("/WEB-INF/view/");
		viewResolve.setSuffix(".jsp");
		return viewResolve;
	}

	@Bean
     JdbcTemplate jdbcTemplate(){
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
    	return jdbcTemplate;
    }

	@Bean
	DataSource dataSource() {
	
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setUsername("root");
	dataSource.setPassword("Gayatri@#02");
	dataSource.setUrl("jdbc:mysql://localhost:3306/students?useSSL=false");
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	return dataSource;
}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/URLToReachResources/**")
		.addResourceLocations("/resources/");
	}
}
