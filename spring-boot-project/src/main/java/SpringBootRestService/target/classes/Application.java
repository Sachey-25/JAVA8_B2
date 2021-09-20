package SpringBootRestService.target.classes;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.springboot.springbootproject.SpringBootProjectApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = (ApplicationContext) SpringApplication.run(Application.class, args);

	}

}

//Project :--> Online Examination <----->