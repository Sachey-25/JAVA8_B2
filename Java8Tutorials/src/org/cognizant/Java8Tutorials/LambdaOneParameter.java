package org.cognizant.Java8Tutorials;

interface letsTalk{
	public String Talk(String name);
}

public class LambdaOneParameter {

	public static void main(String[] args) {
		letsTalk talk = (name) -> {
			return name + "Guys any doubts?????";
		};
		System.out.println(talk.Talk("Sachin asks" + " "));

	}

}
