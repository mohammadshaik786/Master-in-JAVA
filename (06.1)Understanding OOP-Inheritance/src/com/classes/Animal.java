package com.classes;

//superclass,base class,parent class
public class Animal {
	
	int age;
	static String name;
	double weight;
	
	public Animal(int age, String name, double weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public static void eat(){
		System.out.println("Eating......");
	}
	public static void sleep(){
		System.out.println(name+"Sleeping.....");
	}
}
