package com.mkseris.springcore;

public class Restaurant {
	FoodMenu salad;
	FoodMenu dessert;
	FoodMenu maincourse;
	IHotBeverage tea;
	public FoodMenu getSalad() {
		return salad;
	}

	public void setSalad(FoodMenu salad) {
		this.salad = salad;
	}

	public FoodMenu getDessert() {
		return dessert;
	}

	public void setDessert(FoodMenu dessert) {
		this.dessert = dessert;
	}

	public FoodMenu getMaincourse() {
		return maincourse;
	}

	public void setMaincourse(FoodMenu maincourse) {
		this.maincourse = maincourse;
	}
	
	public IHotBeverage getTea() {
		return tea;
	}

	public void setTea(IHotBeverage tea) {
		this.tea = tea;
		}

	public void burger(){
		maincourse.burger();
	}
	
	
	public void ceaserSalad(){
	salad.ceaserSalad();
	
	}
	
	
	public void ricePudding(){
		dessert.ricePudding();
		
	}
	

	public void prepareTea(){
		tea.prepareTea();
	}
	
}
