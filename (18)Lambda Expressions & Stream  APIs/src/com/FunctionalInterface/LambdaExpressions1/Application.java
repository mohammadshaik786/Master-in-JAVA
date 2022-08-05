package com.FunctionalInterface.LambdaExpressions1;

public class Application {

	public static void main(String[] args) {
		
		/*
		//Normal java functionality
		Human tom = new Human();
		tom.walk();
		
		Robot sufi = new Robot();
		sufi.walk();*/
		
		/*Human tom = new Human();
		Walker(tom);
		
		Robot sufi = new Robot();
		sufi.walk();*/
		
		Human tom = new Human();
		Walker(tom);
		
		Robot sufi = new Robot();
		Walker(sufi);
		
		//Before with java7, using anonymous class
		Walker(new Walkable(){

			@Override
			public void walk() {
				System.out.println("Custom Object walking....");	
			}
		});
		
		//Lambda Expression
		Walker(() -> System.out.println("Custom Object walking...."));
	
		//Functional Programming
		//LambdaInterface aBlockofCode = () -> {
		Walkable aBlockofCode = () -> {
			System.out.println("Custom Object walking....");
			System.out.println("The object tripped......");
		};
		Walker(aBlockofCode);
	}

	/*public static void Walker(Human human){
		human.walk();
	}*/
	
	public static void Walker(Walkable walkableentity){
		walkableentity.walk();
	}
}



/*
 * (1)By creating static method outside main class and passing classes i.e Human,Robot 
   we can invoke methods in classes. Note: no interfaces in classes
 * (2)By using interfaces, for classes 	and in interface need to have only 1 abstract method

 * Lambda Expressions denoted by "() ->"
   () : denotes parameters 
   Eg: (1)1 parameter : ()
   	   (2)2 or more parameters: (a,b) &so on...
   -> : denotes methods or extra code inside method defination
   
 * Functional Interface
   The lambda Expressions with a block of code must be assigned to a variable of type Functional interface
   (which is an interface having only one abstract method)


 * Lambda Expressions is a block of code used to implements method defined by Functional Interface
	Walker(() -> System.out.println("Custom Object walking...."));
	Here Walker() is a Functional Interface and walk() is a method inside that	
	
  Note: Lambda expressions type should be functional interface

*/