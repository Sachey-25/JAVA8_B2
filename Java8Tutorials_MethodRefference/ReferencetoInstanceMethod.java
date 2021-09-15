package org.cognizant.Java8Tutorials_MethodRefference;

import org.cognizant.Java8Tutorials_MethodRefference.machineCode.InstanceMethodReference;

//Syntax : -> containingObject :: instanceMethodName
interface machineCode{
	void codingmachine();

	public class InstanceMethodReference{
		public void ByteCode() {
			System.out.println("Hello, I'm Non-static Method");
		}
	}
}
public class ReferencetoInstanceMethod {

	public static void main(String[] args) {
		
		//Creation object --> Instantiation
		InstanceMethodReference imr = new InstanceMethodReference();	
		
		//Referring non-static method using reference
		machineCode mCode = imr :: ByteCode;
		
		//calling interface method
		mCode.codingmachine();
	}
}