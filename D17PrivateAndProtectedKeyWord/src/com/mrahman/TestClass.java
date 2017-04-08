package com.mrahman;

public class TestClass {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.height=6;
		animal.walk();
		//Private method and properties can't be accessed here. 
		//These can only be access within the class they are declared and defined 
		//Following is not allowed as they were declared private
//		animal.haircolor;
//		animal.eat();
		
		
		
		
		
		

	}

}
