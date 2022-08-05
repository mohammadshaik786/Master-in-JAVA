package com.Builtin.FunctionalInterface3;

import java.util.Arrays;
import java.util.List;

public class Application1 {

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
		
		printCarByPriceRange(cars,15000,22000);
		printCarByColor(cars,"Blue");
				
	}
	
	public static void printCarByPriceRange(List<Car> cars,int low, int high){
		for(Car c : cars ){
			if(c.getPrice()>low && c.getPrice()<high){
				 c.printCar();
			}
		}
	}
	
	public static void printCarByColor(List<Car> cars,String color){
		for(Car c : cars ){
			if(c.getColor().equals(color)){
				 c.printCar();
			}
		}
	}
	
}


//Normal execution