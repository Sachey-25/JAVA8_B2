package org.cognizant.Java8Tutorials_MethodRefference;
//Three types of method reference java -8
/* 1. Reference to a static method
 * 2. Reference to an instance method (object method)
 * 3. reference to a constructor
 */
//Reference to a static --> ContainingClass :: staticMethodName
interface letsSay{ 
	void talk();
	
public class MethodReference_static{
	public static void Rocket() {
		System.out.println("Hello, I'm Static method here");
		System.out.println("And I', launchng a rocket");
}
}

public class Method_Refernces {

	public static void main(String[] args) {
		//Referring to static method
		letsSay interaction = MethodReference_static :: Rocket;		
		//Calling interface 
		interaction.talk();	
	}
}
}
