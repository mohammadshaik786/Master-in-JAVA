package com.Builtin.FunctionalInterface3;

import java.util.Arrays;
import java.util.List;

public class Application2 {

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
		printCars(cars,new Carcondition() {
			
			@Override
			public boolean test(Car c) {
				return c.getPrice() >= 18000 && c.getPrice() <= 22000;
			}
		});
		
		System.out.println("Print Cars having color blue:");
		printCars(cars,new Carcondition() {
			
			@Override
			public boolean test(Car c) {
				return c.getColor().equals("Blue");
			}
		});
		
		//Lambda
		System.out.println("Using Lambda Expressions:");
		printCars(cars,(c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
		printCars(cars,(c) -> c.getColor().equals("Blue"));
		
	}
	
	public static void printCars(List<Car> cars,Carcondition condition){
		for(Car c : cars){
			if(condition.test(c)){
				c.printCar();
			}
		}
	}
	
}

@FunctionalInterface
interface Carcondition {
	public boolean test(Car c);
}

//Using anonymous class, With 1 method we are using two different behaviors i.e polymorphism
//By using Lambda Exprewssions