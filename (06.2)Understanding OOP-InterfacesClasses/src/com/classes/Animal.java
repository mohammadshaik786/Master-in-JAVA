package com.classes;

//superclass,base class,parent class
public class Animal {
	
	int age;
	static String gender;
	double weight;
	
	public Animal(int age, String gender, double weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	
	public static void eat(){
		System.out.println("Eating......");
	}
	public static void sleep(){
		System.out.println(gender+"Sleeping.....");
	}
}
