package com.Threads.RunnableInterface2;

public class Application2 {

	public static void main(String[] args) {
		
		System.out.println("Starting Thread 1");
		Tasks taskRunner1 = new Tasks("Thread A");
		//taskRunner1.run();
		Thread t1 = new Thread(taskRunner1);
		t1.start();
		
		System.out.println("Starting Thread 2");
		Tasks taskRunner2 = new Tasks("Thread B");
		//taskRunner2.run();
		Thread t2 = new Thread(taskRunner2);
		t2.start();	
	}

}

class Tasks implements Runnable{
	String name;
	public Tasks(String name){
		this.name = name;
	}
	
	public void run(){
		Thread.currentThread().setName(this.name);
		for(int i=0 ; i<1000 ; i++){
			System.out.println("number:" +i+ "-" + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/*
 * Sleep() method : for execution time 
   Should be used using try-catch block.
 * If use 
    class Task implements Runnable
    then it not belongs to thread, as it executes in normal java flow
   
*/
