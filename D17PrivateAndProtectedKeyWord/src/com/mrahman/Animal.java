package com.mrahman;

public class Animal {

	public Animal() {
		Animal animal = this;
		animal.hairColor="Black";
		animal.eat();
	}

	public Animal(String hColor, int h, int w) {
		Animal animal = this;
		animal.hairColor = hColor;
		animal.height = h;
		animal.weight = w;
		System.out.println("Hi I am the three argument constructor...");
	}

	private String hairColor;
	public int height;
	public int weight;

	private void eat() {
		Animal animal = this;
		animal.walk();

		System.out.println("Hi, I am an Animal and I am eating...");
	}

	public void walk() {
		System.out.println("Hi, I am an Animal and I am walking...");
	}

}
