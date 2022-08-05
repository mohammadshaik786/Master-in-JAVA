package com.FunctionalInterface.LambdaExpressions.Practice2;

public class Application {

	public static void main(String[] args) {
		
		//Lambda Expression
		Walker(() -> System.out.println("Custom Object walking...."));
	
		//Functional Programming
		Walkable aBlockofCode = () -> {
			System.out.println("Custom Object walking....");
			System.out.println("The object tripped......");
		};
		Walker(aBlockofCode);
		
		/*public void sayHello(){
			System.out.println("Hello Mohammad");
		}*/
		LambdaInterface lambda = () -> System.out.println("Hello Mohammad");
		lambda.somemethod();
		
		/*public int sum(int a,int b){
			return a+b;
		}*/ //Need to create Functional Interface in which abstract method having two arguments
		Calculate sum = (a,b) -> a+b;
		System.out.println(sum.compute(25, 35));
	
		/*public int nonZeroDivide(int a,int b){
			if(a == 0)
				return 0;
			return a/b;
		}*/
		Calculate nonZeroDivide = (a,b) -> {
			if(a == 0)	
				 return 0;
			return a/b;
		};
		System.out.println(nonZeroDivide.compute(6, 3));
		
		/*public String reverse(String str){
			String res = "";
			for(int i=str.length()-1;i>0;i--){
				res += str.charAt(i);
			}
			return res;
		}*/
		//Reverse rev = (str) -> {
		MyGenericInterface<String> rev = (str) -> {
			String res = "";
			for(int i=str.length()-1;i>=0;i--){
				res += str.charAt(i);
			}
			return res;
		};
		System.out.println(rev.work("mohammad"));
		
		/*public int factorial(int num){
		int res = 1;
		for(int i=num;i>0;i--){
			res *= num;
		}
		return res;
		}*/
		//Factorial fact = (n) -> {
		MyGenericInterface<Integer> fact = (n) -> {
			int res = 1;
			for(int i=1;i<=n;i++){
				res *= i	;
			}
			return res;
		};
		System.out.println(fact.work(10));
	
	}

	public static void Walker(Walkable walkableentity){
		walkableentity.walk();
	}
	
}

interface Calculate{
	public int compute(int arg1,int arg2);
}

/*interface Reverse{
	public String work(String str);
}

interface Factorial{
	public int work(int number);
}*/

interface MyGenericInterface<T>{
	public T work(T t);
}

/*
 
 * Lambda Expressions is a block of code used to implements method defined by Functional Interface
   Eg:  Walker(() -> System.out.println("Custom Object walking...."));
	Here Walker() is a Functional Interface and walk() is a only 1 method inside that interface
 * Use Annotation "@FunctionalInterface" as a best practice for interface not to allow more than 1 method in future.

   Why Lambda:
 * Lambda dissassociates set of instructions from object.Traditionally in OOPS, to run any functionality that functionality need to be a part of object of class
   Hence by using Lambda, it break the association, so that it can use non associated methods or functions
   Finally Lambda allows the seperation of behaviour from objects	
 * Lambda has some built-in functionalities i.e it allows generic concept
 * From Java8, the main feature is 
   (1)Java switches from OOP to Functional Programming(to Compete with other programming languages in bulk data processing
   (2)To overcome collections usage in OOP, java8 introduces Functional Programming
*/