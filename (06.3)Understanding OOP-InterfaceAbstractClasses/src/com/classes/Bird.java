package com.classes;

//subclass,child class
public class Bird extends Animal{
	
	public Bird(int age, String gender, double weight) {
		super(age, gender, weight);
	}
	
	public void jumps(){
		System.out.println("just flies ...");
	}

	@Override
	public void move() {
		System.out.println("wings are flabbing");
		
	}

}
