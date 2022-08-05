package com.Collections.HashSetWithHashcode3;

import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
		HashSet<Animal> animals = new HashSet<>();
		Animal animal1 = new Animal("Cat",10);
		Animal animal2 = new Animal("Dog",20);
		Animal animal3 = new Animal("Cat",10);
		Animal animal4 = new Animal("Cat",10);
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		
		for(Animal anmal : animals){
			System.out.println(anmal);
		}
		
//		//Remove equals()
//		System.out.println(animal1.equals(animal3));
//		
//		//Remove hashCode() method in constructor class
//		System.out.println(animal1.hashCode());
//		System.out.println(animal3.hashCode());
	}

}


/*
*Hashset does not generate unique value,but by using constructor class it is generating repeated data
*So,to overcome this we need to add "Generate HashCode() and Equals()" in consructor class


*/