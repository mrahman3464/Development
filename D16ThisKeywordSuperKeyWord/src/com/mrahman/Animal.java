package com.mrahman;

public class Animal {

	public Animal() {
		System.out.println("Hi I am the default constructor...");
	}

	public Animal(String hColor, int h, int w) {
		Animal animal = this;
		animal.hairColor = hColor;
		animal.height = h;
		animal.weight = w;
		System.out.println("Hi I am the three argument constructor...");
	}

	public String hairColor;
	public int height;
	public int weight;

	public void eat() {
		Animal animal = this;
		animal.walk();

		System.out.println("Hi, I am an Animal and I am eating...");
	}

	public void walk() {
		System.out.println("Hi, I am an Animal and I am walking...");
	}

}
