package com.Threads.LearnConcurrency5_1;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Integer> questionQueue = null;
	public Consumer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		
		/*try {
			System.out.println("Answered Question: " + questionQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		try {
			Thread.sleep(1000);
			System.out.println("Answered Question: " + questionQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
