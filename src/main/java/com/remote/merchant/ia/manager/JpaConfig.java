package com.remote.merchant.ia.manager;


import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {

	    @Bean
	    public DataSource getDataSource() 
	    {
	        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
	        dataSourceBuilder.driverClassName("org.h2.Driver");
	        dataSourceBuilder.url("jdbc:h2:./test");
	        dataSourceBuilder.username("sa");
	        dataSourceBuilder.password("");
	        return dataSourceBuilder.build();
	    }
}

