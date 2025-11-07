package com.tnsif;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
	
	public String welcome(@RequestParam(value="name",defaultValue = "DheenaKrishna") String name) {
		return "Hello "+name;
	}
	
	@GetMapping("/greet/{name}")
	public String greet(@PathVariable String name) {
		return "Welcome "+name;
	}

}
