package HW7;

import java.io.Serializable;

public class Cat extends Animal {

	
	Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
