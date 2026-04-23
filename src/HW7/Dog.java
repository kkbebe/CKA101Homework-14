package HW7;

import java.io.Serializable;

public class Dog extends Animal  {
	
	
	
	
	Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
