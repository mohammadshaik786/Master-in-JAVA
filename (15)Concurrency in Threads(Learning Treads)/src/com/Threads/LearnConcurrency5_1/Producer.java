package com.Threads.LearnConcurrency5_1;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	int questionNo;
	BlockingQueue<Integer> questionQueue = null;
	public Producer(BlockingQueue<Integer> questionQueue) {
		this.questionQueue = questionQueue;
	}

	@Override
	public void run() {
		
		/*try {
			synchronized (this) {
				int nextQuestion = questionNo++;
				System.out.println("Got new Question " + nextQuestion);
				questionQueue.put(questionNo++);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		while(true){
			try {
				synchronized (this) {
					int nextQuestion = questionNo++;
					System.out.println("Got new Question " + nextQuestion);
					questionQueue.put(questionNo++);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
