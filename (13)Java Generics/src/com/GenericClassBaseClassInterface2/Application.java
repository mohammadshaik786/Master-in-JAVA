package com.GenericClassBaseClassInterface2;

import java.util.List;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		/* Polymorphism
		Object obj = new Object();
		String str = new String();
		obj = str;
		*/
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
		// Not allowing sub class
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Accountant> accountants = new ArrayList<>();
//		employees = accountants;
		
		// To allow child class to assign to parent class, as generic allows ? as object class i.e Object is grand parent of any data type 
		ArrayList<?> employee = new ArrayList<>();
		ArrayList<String> accountant = new ArrayList<>();
		employee = accountant;
		
		//upper bound : Here ? is a child class 
		ArrayList<? extends Employee> employee2 = new ArrayList<>();
		ArrayList<Accountant> accountant2 = new ArrayList<>(); //also Employee i.e ArrayList<Employee> e = new ArrayList<>();
		employee2 = accountant2;
		
		//lower bound : here ? is a parent class
		ArrayList<? super Employee> employee3 = new ArrayList<>();
		ArrayList<Object> accountant3 = new ArrayList<>();
		employee3 = accountant3;
		
		ArrayList<Employee> employees1 = new ArrayList<>();
		employees1.add(new Employee());
		ArrayList<Accountant> accountants1 = new ArrayList<>();
		accountants1.add(new Accountant());
//		employees1 = accountants1;
		makeWork(employees1);
		makeWork2(accountants1);

	}
	
	public static void makeWork(List<Employee> employees){
		for(Employee emp : employees){
			emp.work();
		}
	}
	
	public static void makeWork2(List<? extends Employee> employees){
		for(Employee emp : employees){
			emp.work();
		}
	}

}

// Also, just change class to interface i.e extends to implements and play
