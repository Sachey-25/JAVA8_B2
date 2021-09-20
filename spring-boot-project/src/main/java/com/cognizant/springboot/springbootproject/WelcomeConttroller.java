package com.cognizant.springboot.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeConttroller {	
	//local host:8080/welcome ----->
	
	//Create an object -->injected //dependency	<--- Spring boot hey controller there's a request dependency 
	//Auto wiring 
	@Autowired
	private WelcomeDependencyService service; //coupled loosely	
	
	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
	
}





