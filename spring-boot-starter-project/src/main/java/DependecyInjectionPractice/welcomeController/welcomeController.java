package DependecyInjectionPractice.welcomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
	//Dependency --- //Maven-dependency ----> jar 
	private WelcomeService service1 = new WelcomeService();
	//spring to manage the bean and create the instance --> injected here
	//Auto-wiring 
	@Autowired
	private WelcomeService service; 
	//how to tell the spring that this needs to be managed
	//welcome service is the dependency of the welcome controller.
	@RequestMapping("/welocme")
	public String welcome() {
		//return "This is Something Great! I can see on browser";
		return service1.retrieveWelcomeMessage();
		}
	}
//Spring and Auto wiring
//Let say welcome message come from welcome service 
// Business logic
// 2. spring to manage the bean and create the instance --> 
//spring
@Component
class WelcomeService{
	public String retrieveWelcomeMessage() {
		//Complex methods --> Business logic
		return "Good Afternoon";
	}
}