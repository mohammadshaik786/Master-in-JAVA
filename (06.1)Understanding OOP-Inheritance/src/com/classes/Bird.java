package com.classes;

//subclass,child class
public class Bird extends Animal{
	
	public Bird(int age, String name, double weight) {
		super(age, name, weight);
	}

	public static void fly(){
		System.out.println(name+"Flying....");
	}
	

}
