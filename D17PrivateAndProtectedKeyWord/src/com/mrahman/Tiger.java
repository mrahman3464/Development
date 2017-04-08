package com.mrahman;

public class Tiger extends Animal {

	// all the properties of Animal
	// all the functions of Animal
	//Limitation: 1. constructors of Animal are not inherited
	//Limitation: 2. public properties/functions are inherited
	//Limitation: 3: private properties/functions are not inherited
	//Limitation: 4: default properties/functions are not inherited if the derived
	//class (child class) is present in some other package
	//Limitation: 5: default properties/functions are inherited if the derived
	//class (child class) is present in the same package
	
	public Tiger() {
	//call to the default construtor of Animal - You have not writeen this
	super("black", 6, 300); // You have specified that make a call to the
	//default constructor of Animal
	System.out.println("Hi I am Tiger and I am the default constructor...");
	}
	Tiger(String fHabits, String tRunner) {
	Tiger tiger = this;
	tiger.foodHabits = fHabits;
	tiger.typeRunner = tRunner;
	System.out.println("Hi I am Tiger and I am the two argument constructor...");
	}
	public String foodHabits;
	public String typeRunner;
	public void hunt() {
	System.out.println("Hi, I am Tiger and I am hunting...");
	}
	
	
}
