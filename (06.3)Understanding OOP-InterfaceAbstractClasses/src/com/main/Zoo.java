package com.main;

import com.classes.Animal;
import com.classes.Bird;
import com.classes.Fish;
import com.classes.Flyable;
import com.classes.Hen;
import com.classes.Sparrow;

public class Zoo {
	
	public static void main(String[] args) {
		
		//interface
		Flyable sp = new Sparrow(5, "M", 10);
		sp.fly();
		
		//No instance for Animal class(absract class)
		Animal hen = new Hen(5, "M", 10);
		hen.move();
		
		Animal fish = new Fish(2, "F", 50);
		fish.move();
		
	}
	
}

/*

Abstraction in Java:
* Abstraction is a process of hiding the implementation details and showing only functionality to the user.
* Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.
* Abstraction lets you focus on what the object does instead of how it does it.

Ways to achieve Abstraction:
There are two ways to achieve abstraction in java
1.Abstract class (0 to 100%)
2.Interface (100%)

Abstract class in Java:
A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember:
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.

*/