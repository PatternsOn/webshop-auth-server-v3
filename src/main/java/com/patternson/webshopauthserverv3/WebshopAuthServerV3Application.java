package com.patternson.webshopauthserverv3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 *
 * Created by Tobias Pettersson 20180320
 */
@SpringBootApplication
@EnableResourceServer
public class WebshopAuthServerV3Application {

	public static void main(String[] args) {
		SpringApplication.run(WebshopAuthServerV3Application.class, args);
	}
}
