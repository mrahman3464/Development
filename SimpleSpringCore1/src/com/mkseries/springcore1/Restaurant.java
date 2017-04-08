package com.mkseries.springcore1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Restaurant {
	
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
	
	
}
