package com.sample.google_cloud_run_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class GoogleCloudRunDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleCloudRunDemoApplication.class, args);
	}

}

// batch from timing -->
// sessions -->timings :00 not
