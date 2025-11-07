package com.tnsif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionWithScopeAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(DependencyInjectionWithScopeAnnotationApplication.class, args);
		
		Entity1 e1 = var.getBean(Entity1.class);
		
		e1.show();
		
		Entity1 e2 = var.getBean(Entity1.class);
		
		e2.show();
	}


}
