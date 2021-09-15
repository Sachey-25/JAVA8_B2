package org.cognizant.Java8Tutorials_MethodRefference;

import java.util.function.BiFunction;

class Arithmetic{
	public static int add(int number_one, int number_two) {
		return number_one + number_two;
	}
}
public class MethodReference_two {  
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static class MethodReference_three{
    	
    public static void main(String[] args) {  
       Thread thread=new Thread(MethodReference_two::ThreadStatus); 
        BiFunction <Integer,Integer,Integer> adder = Arithmetic :: add;
      thread.start();       
        int result = adder.apply(10, 20);
        System.out.println(result);
    }  
}  
}