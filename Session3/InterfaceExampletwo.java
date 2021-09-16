package org.cognizant.Java8Tutorials.Session3;


interface Welcome{
	void greet(String msg); // abstract method
	//it also contain any number of object class methods
	int machineCode();
	String byteCode();
	String toString();
	boolean equals (Object obj);
}
//root class // main class  <---- functional interface should be applied on root/main class 
//using implements keyword
public class InterfaceExampletwo implements Welcome {
	public void greet(String msg) { System.out. println (msg); }

	public static void main(String[] args) {
		
		InterfaceExampletwo fie = new InterfaceExampletwo();
		fie.greet("No matter how many methods present in the interface, " + 
					" the implementation still possible");

	}

	@Override
	public int machineCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String byteCode() {
		// TODO Auto-generated method stub
		return null;
	}
}
