package com.Threads1;

public class Application {

	public static void main(String[] args) {
		
		Task t1 = new Task();
		t1.start();
		
		System.out.println("Im Mohammad");
		
		//t1.start();
		
		Task t2 = new Task();
		t2.start();	
	}

}

class Task extends Thread{
	
	public void run(){
		for(int i=0 ; i<1000 ; i++){
			System.out.println("number:" +i);
		}
	}
}

/*
 * Normally compiler compiles java code step by step.So the other method waits until first method completes execution

 * A thread is a execution of flow of program.Thread allows to execute multiple functions or methods. 
 * In the above program, thread allows t1,syso,t2 to execute at the same time
 * Same instance cannot be executed more than once i.e t1.start(); - throws main exception
 * Syntax : In class extends thread need to be added. For thread implements runnable(interface) contains only run method, so we use run method in class
   But calling in main function,we call using start() method
 * Simply, Thread allows multitasking

*/