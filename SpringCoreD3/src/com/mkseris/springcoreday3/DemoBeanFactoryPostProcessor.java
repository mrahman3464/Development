package com.mkseris.springcoreday3;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		// TODO Auto-generated method stub
		
		BeanDefinition beanDefinition=beanFactory.getBeanDefinition("restaurantBean");
		MutablePropertyValues propertyValue=beanDefinition.getPropertyValues();
		propertyValue.add("welcomeNote", "The Value is modified inside BFPP");
	}

}
