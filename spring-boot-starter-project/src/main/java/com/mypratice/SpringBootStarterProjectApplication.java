package com.mypratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStarterProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
		SpringApplication.run(SpringBootStarterProjectApplication.class, args);
		
		for(String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
/* Web Application --> Spring Boot Starter web
REST API --> Spring boot Starter web
TAlk to database using JPA --> Spring Boot Starter DATA JPA
Talk to database using JDBC --> Spring Boot Starter JDBC
Secure your web application or Rest API - Spring Boot Starter Security
*/
//--- Spring Boot Auto Configuration 
// logging.level.org.springframework = DEBUG

//Spring Boot Actuator: Monitor and Manage your application in your production
/*---> Provides a number of end points :
	---> beans : Compile list of Spring beans in your app
	---> health L Application health information
	---> metrics - Application metrics
	---> mappings - Details around Request Mappings
	*/

//Spring boot another features :- Spring DevTools
/* increases developer productivity
---> why do you need to restart the server for every code change? */
