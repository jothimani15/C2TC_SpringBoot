package com.tnsif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QualifierAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(QualifierAnnotaionApplication.class, args);
		
		Consumer c2= var.getBean(Consumer.class);
		
		c2.order();
	}

}
