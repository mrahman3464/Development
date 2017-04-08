package com.mkseries.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springconfig1.xml");
		Restaurant restaurant= (Restaurant)context.getBean("restaurantBean");
		restaurant.prepareTea();
		restaurant.displayWelcomeNote();
		restaurant.displayWaitersList();
		restaurant.displayWaitersSet();
		restaurant.displayWaitersMap();
		
		
		
		
		
	}
	
}
