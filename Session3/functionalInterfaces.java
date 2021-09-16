package org.cognizant.Java8Tutorials.Session3;

@FunctionalInterface
interface helloworld{
	///abstract method
	void hello(String msg);
//in order to make the functional interface we need to implement 
// the class on interface.
}
public class functionalInterfaces implements helloworld {
	public void hello(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		//In Java* we will use the word called 
		//@FunctionalInterface because to make an existing
		//interface to functional interface since it 
		// contains exactly one abstract method.
		functionalInterfaces fie = new functionalInterfaces();
		fie.hello("Good AfterNoon!");
	}

}
