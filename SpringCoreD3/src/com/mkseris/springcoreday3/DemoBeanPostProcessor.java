package com.mkseris.springcoreday3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("executing after init method of :" + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("executing before init method of :" + beanName);
		
//		if(beanName.equalsIgnoreCase("restaurantBean")){
//			Restaurant res =(Restaurant)bean;
//			res.setWelcomeNote("Hi getting set inside the post processor class");
//		}else if(beanName.equalsIgnoreCase("teaBean")){
//			Tea tea=(Tea)bean;
//			//tea.prepareTea("Preparing Harbal Tea");
	//	}
		
		return bean;
	}

}
