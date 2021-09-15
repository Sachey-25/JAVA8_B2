package org.congnizant.java8tutorials_session2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id; 
	String name; 
	int price;
	String sachin;
	//Constructor  ---> initiliaze --> store the data object
public Product(int id, String name, int price, String sachin) {
	super();
	this.id=id;
	this.name=name;
	this.price = price;
	this.sachin= sachin;
}
}
public class LambdaCollections {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(101,"Chair",5000,""));
		list.add(new Product(102,"Television",15000,""));
		list.add(new Product(103,"Mobile",7000,""));
		list.add(new Product(104,"Apple",9000,""));
		System.out.println("Sorting on the basis of name");
		//Implement the lambda expression  --> two parameters
		Collections.sort(list,(name_one, name_two) -> {
			return name_one.name.compareTo(name_two.name);
		});
		//for loop 
		for (Product item : list) {
			System.out.println(item.id + " " + item.name+ " " + item.price);
		}
	}
}