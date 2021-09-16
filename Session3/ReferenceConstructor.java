package org.cognizant.Java8Tutorials.Session3;

interface Messageable{
	Message getMessage(String msg);
}
class Message{
	Message(String msg){	
	System.out.println(msg);
	}
}

interface Message_one{
	Message_one getmessage(String info, int date, String name);

	void getMessage(String string, int i, String string2);
}
class Command{
	Command(String info, int date, String name){
		System.out.println(info);
	}
}
public class ReferenceConstructor {
	public static void main(String[] args) {
		
		//With the help of interface we can map the class created
		Messageable greetings = Message :: new; // New object gets created to the class : message
		greetings.getMessage("Good Morning Folks!");
		
		//Message_one Test = Command::new;
		//Test.getMessage("dayisThrusday",16,"JavaTraining");

	}

}
