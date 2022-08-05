package com.Streams4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
	public static void main(String[] args) {
		
			IntStream
			.range(1,10)
			.forEach((x) -> System.out.print(x));
		System.out.println();
		
		//Integer Stream with skip
			IntStream
			.range(1,10)
			.skip(5)
			.forEach((x) -> System.out.print(x));
		System.out.println();
	
		//Integer stream with sum
			int val = IntStream
			.range(1,10)
			.sum();
		System.out.println(val);
		
		//Stream of sorted and findFirst
		Stream.of("surayj","mohammad","yaseen")
			.sorted()
			.findFirst()
			.ifPresent((str) -> System.out.println(str));
	
		//Stream from Array,sort,filter and print
		String[] items = {"car","cricket","bat","ball","baloon","bike","toy"};
		Stream.of(items)
			.filter((x) -> x.startsWith("b"))
			.sorted()
			.forEach((x) -> System.out.print(x+ ","));
		System.out.println();
		
		//Average of squares of int array
		Arrays.stream(new int[]{2,4,6,8,10})
			.map((x) -> x*x)
			.average()
			.ifPresent(x -> System.out.print(x));
		System.out.println();
		
		//Stream from a list,filter and print
		List<String> listofItems = Arrays.asList("Computer","Desktop","Cricket","Mouse","Car");
		listofItems.stream()
			.map((x) -> x.toLowerCase())
			.filter(x -> x.startsWith("c"))
			.sorted()
			.forEach(x -> System.out.print(x+ ","));
		System.out.println();
	}

}
