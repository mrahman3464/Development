package com.mkseris.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springconfig.xml");
		Restaurant restaurant= (Restaurant)context.getBean("restaurantBean");
		restaurant.prepareTea();
		restaurant.burger();
		restaurant.ceaserSalad();
		restaurant.ricePudding();
		
		
		
	}
	
}
