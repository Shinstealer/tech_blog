package com.shinstealer.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = { "com.shinstealer.sample" })
public class RootConfig {

	@Bean
	public DataSource dataSource() {

		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
		hikariConfig.setUsername("blog");
		hikariConfig.setPassword("1234");

		HikariDataSource dataSource = new HikariDataSource(hikariConfig);

		return dataSource;

	}
}
