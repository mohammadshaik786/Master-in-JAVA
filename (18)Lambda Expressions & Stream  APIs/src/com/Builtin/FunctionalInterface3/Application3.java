package com.Builtin.FunctionalInterface3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Application3 {

	public static void main(String[] args) {
		
		List<Car> cars = Arrays.asList(
				new Car("Honda","Acccord","Red",22300),
				new Car("Honda","Civic","Blue",17700),
				new Car("Toyota","Land Cruiser","White",48500),
				new Car("Toyota","Corolla","Black",16200),
				new Car("Toyota","Camry","Blue",24000),
				new Car("Nisan","Sentra","White",17300),
				new Car("Mitsubishi","Lanser","White",20000),
				new Car("Jeep","Wrangler","Red",24500)
				);
		
		System.out.println("Print cars ranging between 18000 and 22000:");
		printCars(cars,(c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
		
		System.out.println("Print Cars having color blue:");
		printCars(cars,(c) -> c.getColor().equals("Blue"));
		
	}
	
	/*public static void printCars(List<Car> cars,Condition<Car> condition){
		for(Car c : cars){
			if(condition.test(c)){
				c.printCar();
			}
		}
	}*/
	
	public static void printCars(List<Car> cars,Predicate<Car> predicate){
		for(Car c : cars){
			if(predicate.test(c)){
				c.printCar();
			}
		}
	}
	
}

/*@FunctionalInterface
interface Condition<T> {
	public boolean test(T t);
}*/


/*
 * Using Generic concept for classes
 	Eg:
 	@FunctionalInterface
	interface Condition<T> {
		public boolean test(T t);
	}
 * Using built-in function
 * Eg:
 	import java.util.function.Predicate;
 	public static void printCars(List<Car> cars,Predicate<Car> condition){
  
*/
