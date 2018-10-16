package de.com.wirecard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Starts SpringBoot application
 * @author wilson
 *
 */
@SpringBootApplication
public class StartApplication  extends SpringBootServletInitializer{

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(StartApplication.class);
        app.run(StartApplication.class, args);
	}

}
