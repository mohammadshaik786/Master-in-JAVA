package com.Threads.UsingSynchronisation3;

public class Application {

	public static void main(String[] args) {
		
		Sequence seq = new Sequence();
		/*for(int i=0; i<100; i++){
			System.out.println(seq.getNext());	
		}*/
		
		Worker worker1 = new Worker(seq);
		worker1.start();
		
		Worker worker2 = new Worker(seq);
		worker2.start();

	}

}

class Worker extends Thread{
	Sequence sequence = null;
	public Worker(Sequence sequence){
		this.sequence = sequence;
	}
	
	public void run(){
		for(int i=0;i<100; i++){
			System.out.println(Thread.currentThread().getName()+ ":" +sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


/*
  * If two instances accessing same class,the o/p is irregular as
    The processor can control only one thread at a time .
    So as two threads are running,the processor control but irregular 
  * To overcome this, use Synchronized blocked in class

*/