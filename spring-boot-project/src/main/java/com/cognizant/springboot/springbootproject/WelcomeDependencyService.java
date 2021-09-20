package com.cognizant.springboot.springbootproject;

import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

@Component
public class WelcomeDependencyService {	
	//global method <------ hard code // complex code 
	// <--- read by somebody else <-- spring boot <---- service layer
	//Spring to manage this bean and create an instance of this 
	
		public String retrieveWelcomeMessage() {
			return "This is retrieved form welcome service";
		}
	}
	// the above class is out of the controller <----- communicated welcome server
	/*dependency injection ---> there would be two annotations 1. @Component 2.@Autowired 
	------------------------> Component bean <object> ------> Auto wired is always given to the mapping
	-------------------------> method level annotations */	
		

