package org.cognizant.Java8Tutorials;
//In order to collect the behavior of the class
interface Drawable {
	public void anyname();
}
public class LambdaExpressions {
	public static void main(String[] args) {
		// Anything which is suppose to be executed ,
		// we need to type in main method 
		
		int width = 25; // integer datatype		
		//without lambda expression implementation  means not using : ->
		// Create an object referencing to an interface		
		/*Drawable something = new Drawable() {
			public void anyname() {
			System.out.println("This is drawing something");
			System.out.println("and its printing " + width );
			}			
		};
		something.anyname();*/
		// With lambda Expression with zero parameter
		Drawable d = () -> {
			System.out.println("Hi My name is Lambda ");
			};
			d.anyname();
	}
}