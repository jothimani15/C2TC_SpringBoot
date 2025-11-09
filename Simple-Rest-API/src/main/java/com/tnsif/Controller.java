package com.tnsif;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
	
	public String Welcome() {
		return "Welcome to REST API demo, this is sent from REST controller of Backend";
	}

}
