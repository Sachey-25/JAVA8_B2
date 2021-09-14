package org.cognizant.Java8Tutorials;

interface Sayable{
	public String say();
}

public class LambdaNoparameters {

	public static void main(String[] args) {
		Sayable sachin = () -> {
			return "Guys! Wait for someminutes, I have something more to say";
		};
		System.out.println(sachin.say());

	}

}
