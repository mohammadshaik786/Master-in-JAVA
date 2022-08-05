package com.Collections.ColletionMethodsWithComparableInterface4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		HashSet<Employee> emp = new HashSet<>();
		emp.add(new Employee("Mohammad",1000,"Programmer"));
		emp.add(new Employee("Surayj",2000,"Developer"));
		emp.add(new Employee("Yaseen",3000,"Businessman"));
		
		ArrayList<Employee> employee = new ArrayList<>(emp);
		Collections.sort(employee);
		System.out.println(employee);
	}

}


/*
 * Here we can sort the values in HashSet by using collection methods using Comparable Interface
 * Then we need to implement Comparable interface and add unimplemented method in consructor class
 * 
*/
