package com.Generics2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
	public static void main(String[] args) {
		
		/*ArrayList<Vehicle> Car = new ArrayList<Vehicle>();
		Vehicle vec = new Vehicle("honda", "new", 200000);
		Car.add(vec);
		Car.add(new Vehicle("Toyota", "pro", 200000));
		Car.add(new Vehicle("BMW", "ultrapro", 200000));
		
		for(Vehicle veh : Car){
			System.out.println(veh);
		}*/
		
		List<Vehicle> Car = new ArrayList<Vehicle>();
		Vehicle vec = new Vehicle("honda", "new", 200000);
		Car.add(vec);
		Car.add(new Vehicle("Toyota", "pro", 200000));
		Car.add(new Vehicle("BMW", "ultrapro", 200000));
		
		List<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		
		SomeGenericMethod(Car);
		SomeGenericMethod(fruits);
		
	}
	
	public static void SomeGenericMethod(List someList){
		for(int i=0;i<someList.size();i++){
			System.out.println(someList.get(i));
		}
	}
}


/*
1.for(Vehicle veh : Car){
		System.out.println(veh);
	}
o/p: user friendly representation
com.ArrayList.Vehicle@15db9742
com.ArrayList.Vehicle@6d06d69c
com.ArrayList.Vehicle@7852e922

To overcome this, we need to add Generate toString()  method in constructor class

2.Generic methods:
By using generic methods we can call whatever child List i.e ArrayList,LinkedList are subclasses of List

*/