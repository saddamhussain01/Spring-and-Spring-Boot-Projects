package com.springboot.profiles.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

	private static Logger LOGGER = LoggerFactory.getLogger(ProfileConfig.class);

	// @Profile annotation is used to conditionally activate/register
	// Used to develop an "if-then-else" conditional checking to configure
	// Allows to register beans by condition 
	
	@Profile(value = "local")
	@Bean
	public void localConfig() {
		LOGGER.info("Succesfully loaded the local environment.");
	}
	
	@Profile(value = "dev")
	@Bean
	public void devConfig() {
		LOGGER.info("Succesfully loaded the development environment.");
	}

	@Profile(value = "qa")
	@Bean
	public void qaConfig() {
		LOGGER.info("Succesfully loaded the testing environment.");
	}

	@Profile(value = "prod")
	@Bean
	public void prodConfig() {
		LOGGER.info("Succesfully loaded the production environment.");
	}
}
