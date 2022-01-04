package com.sample.google_cloud_run_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class GoogleCloudRunDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleCloudRunDemoApplication.class, args);
	}

}
