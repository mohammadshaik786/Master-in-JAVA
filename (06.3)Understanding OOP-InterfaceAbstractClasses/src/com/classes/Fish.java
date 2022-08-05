package com.classes;

//subclass,child class
public class Fish extends Animal{
	
	public Fish(int age, String name, double weight) {
		super(age, name, weight);
	}

	public static void swim(){
		System.out.println("Swim.....");
	}

	@Override
	public void move() {
		System.out.println("Ready to swim");
		
	}

}
