package com.main;

import com.classes.Animal;
import com.classes.Bird;
import com.classes.Fish;

public class Zoo {
	
	public static void main(String[] args) {
		
		Animal an = new Animal(10,"lion",100.00);
		an.sleep();
		
		Bird bd = new Bird(5,"owl",25);
//		Bird.fly();
		bd.fly();
		bd.eat();
		bd.sleep();
		
		Fish fs = new Fish(5,"shark",1000.00);
		fs.swim();
	}
	
	
}
