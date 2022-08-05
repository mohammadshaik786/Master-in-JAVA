package com.Builtin.FunctionalInterface3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application4 {
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
		
		Function<Car,String> priceAndcolor = (c) -> "Price:" +c.getPrice()+"\tColor:"+c.getColor();
		String cardetails = priceAndcolor.apply(cars.get(0));
		System.out.println(cardetails);
}

}

//In java8, this "Function<Car,String>" interface is a default functional interface where new features have been added i.e stream API