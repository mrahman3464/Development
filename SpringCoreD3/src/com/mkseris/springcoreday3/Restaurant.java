package com.mkseris.springcoreday3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//public class Restaurant
public class Restaurant implements DisposableBean,InitializingBean{
	
	//@Autowired
	//@Qualifier("morning")
	//@Qualifier("evening")
	//@Qualifier("teaBean")
	IHotBeverage tea;
	String welcomeNote;
	ArrayList<String>waitersList;
	HashSet<String>waitersSet;
	HashMap<String,String>waitersMap;

	public void setWaitersMap(HashMap<String, String> waitersMap) {
		this.waitersMap = waitersMap;
	}

	public void setWaitersList(ArrayList<String> waitersList) {
		this.waitersList = waitersList;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	
    public void setTea(IHotBeverage tea) {
		this.tea = tea;
		}
    
    public void setWaitersSet(HashSet<String> waitersSet) {
		this.waitersSet = waitersSet;
	}

//public Restaurant(IHotBeverage tea){
//		this.tea=tea;
//	}
	
	

	

	public void prepareTea(){
		tea.prepareTea();
	}
	
	public void displayWelcomeNote(){
		System.out.println(welcomeNote);
	}
	
	
	public void displayWaitersList(){
		System.out.println(waitersList);
	}
	
	
	public void displayWaitersSet(){
		System.out.println(waitersSet);
	}
	
	public void displayWaitersMap(){
		System.out.println(waitersMap);
	}
	
	
//	public void init(){
//		System.out.println("executing the init method of Restaurant");
//	}
	
	public void destroy(){
		System.out.println("executing the destroy method of Restaurant");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("executing the init method of Restaurant");
	}
	
	
}
