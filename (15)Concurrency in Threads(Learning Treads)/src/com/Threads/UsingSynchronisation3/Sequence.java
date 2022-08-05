package com.Threads.UsingSynchronisation3;

public class Sequence {
	
	private int value = 0;
	public int getNext(){
		/*value = value + 1;
		return value;*/
		synchronized(this){
			value = value + 1;
			return value;
		}
	}

}

/*
Also by using synchronized in method itself
public synchronized int getNext(){
	value = value + 1;
	return value;
}
*/