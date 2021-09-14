package org.cognizant.Java8Tutorials;

interface summation{
	int add(int number_one, int number_two);
}


public class LambdaTwoParameter {

	public static void main(String[] args) {
		//lambda Expression with name addition
		summation addition = (number_one, number_two) ->
		(number_one+number_two);
		System.out.println("Adding 10 and 20 are : " + addition.add(10,20));
		//lambda Expression with name add_once
		summation add_once = (number_one, number_two) ->
		(number_one+number_two);
		System.out.println("Adding 20 and 30 are : " + add_once.add(20,30));
		//lambda Expression with name add_twice
		summation add_twice= (number_one, number_two) ->
		(number_one+number_two);
		System.out.println("Adding 30 and 40 are: " +add_twice.add(30,40));
	}
}
