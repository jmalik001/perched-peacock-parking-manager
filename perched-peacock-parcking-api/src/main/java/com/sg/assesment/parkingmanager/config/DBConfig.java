package com.sg.assesment.parkingmanager.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DBConfig {
	
	@Value("classpath:schema.sql")
	private Resource schemaScript;
	 
	@Bean
	public DataSourceInitializer dataSourceInitializer(DataSource dataSource) {
	    DataSourceInitializer initializer = new DataSourceInitializer();
	    initializer.setDataSource(dataSource);
	    initializer.setDatabasePopulator(databasePopulator());
	    return initializer;
	}
	 
	private DatabasePopulator databasePopulator() {
	    ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
	    populator.addScript(schemaScript);
	    return populator;
	}
	
	 @Bean
	    public DataSource getDataSource() {
	       // config<?> config = config.create();
	     HikariConfig dbConfig = new HikariConfig();   
	     dbConfig.setDriverClassName("org.h2.Driver");
	     dbConfig.setJdbcUrl("jdbc:h2:mem:test");
	     dbConfig.setUsername("SA");
	     dbConfig.setPassword("");
	        return new HikariDataSource(dbConfig);
	    }

}
