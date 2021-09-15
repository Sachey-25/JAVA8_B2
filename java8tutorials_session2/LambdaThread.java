package org.congnizant.java8tutorials_session2;

public class LambdaThread {

	public static void main(String[] args) {
		
		//thread without lambda 
		
		/*Runnable runner = new Runnable() {
			public void run() 
			{
				System.out.println("Thread_one is running <--- without lambda expression");
				
			}
	};*/
	// Create a object to call the thread
	//Thread thread = new Thread(runner);
	//thread.start();
	
	// Thread with Lambda expressions
	Runnable run_lamb = () -> {
		System.out.println("Thread_two is running  - lambad expression");
	};
	Thread thread_la = new Thread(run_lamb);
	thread_la.start();
}
}
