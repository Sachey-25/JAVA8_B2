package org.cognizant.Java8Tutorials.Session3;

interface Doable{
	default void doIt() {
		System.out.println("Do it now!");
	}
}
@FunctionalInterface
interface letsSay extends Doable{
	void say(String msg); //Abstract method
}

public class FuntionalInterfaceExtends implements letsSay{
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FuntionalInterfaceExtends fie = new FuntionalInterfaceExtends();
		fie.say("Hello There! again .... Good after noon");
	}
}
