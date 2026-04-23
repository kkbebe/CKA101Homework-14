package HW7;

import java.io.Serializable;

public abstract class Animal implements Serializable {
	String name;
	
	Animal(String name){
		this.name = name;
	}
	
	abstract void speak();

}
