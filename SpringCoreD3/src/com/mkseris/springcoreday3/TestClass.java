package com.mkseris.springcoreday3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestClass {

	public static void main(String[] args) {
		//ApplicationContext context =new ClassPathXmlApplicationContext("springconfig.xml");
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("springconfig.xml");
		//Using ApplicationContext class we making use of springconfig.xml class
		//
		context.registerShutdownHook();     
		//registerShutdownHook is not available in ApplicationContext but its available in AbstractApplicationContext
		//registerShutdownHook allow to call destroy method.
		//Can you guarantee that garbage collector will destroy/remove a reference from the hip?---no
		//singleton and prototype class and object
		//Singleton approach:is a default approach, going to create one bean and every time it will provide the same reference every time 
		//Prototype approach: creates a new bean every time a class is being called
		//When to use singleton and when to use prototype?
		//Relation between singleton and scale ability and memory management
		//Heap, Stake and method area
		
		
		Restaurant restaurant= (Restaurant)context.getBean("restaurantBean");
		//Restaurant restaurant= (Restaurant)
		context.getBean("restaurantBean");		
		restaurant.prepareTea();
		restaurant.displayWelcomeNote();
		restaurant.displayWaitersList();
		restaurant.displayWaitersSet();
		restaurant.displayWaitersMap();
		
	
		Restaurant restaurant1= (Restaurant)context.getBean("restaurantBean");
		restaurant1.prepareTea();
		if(restaurant==restaurant1){
			System.out.println("Both are same");
		}else{
			System.out.println("Both are not same");
		}
		
		
		
	}
	
}
