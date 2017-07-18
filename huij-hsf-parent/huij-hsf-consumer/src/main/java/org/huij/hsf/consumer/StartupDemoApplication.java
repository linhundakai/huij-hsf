package org.huij.hsf.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations="classpath:hsf-consumer-beans.xml")
@SpringBootApplication
public class StartupDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartupDemoApplication.class, args);
	}
}
