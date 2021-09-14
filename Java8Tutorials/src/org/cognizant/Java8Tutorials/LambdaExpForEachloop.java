package org.cognizant.Java8Tutorials;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpForEachloop {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Sachin");
		names.add("Bangalore");
		names.add("Wipro");
		names.add("Bidar");
		//Implementing Lambda Expression without interface, on ForEach loop
		names.forEach((count)-> System.out.println(count));
	}
}