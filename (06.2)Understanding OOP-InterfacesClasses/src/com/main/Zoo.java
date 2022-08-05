package com.main;

import com.classes.Animal;
import com.classes.Bird;
import com.classes.Flyable;
import com.classes.Sparrow;

public class Zoo {
	
	public static void main(String[] args) {
		
		Flyable fl = new Sparrow(5, "M", 10);
		fl.fly();	
		
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
 
An interface in the Java programming language is an abstract type that is used to specify a behavior that classes must implement.
 
1.It is used to achieve abstraction.
2.By interface, we can support the functionality of multiple inheritance.
3.It can be used to achieve loose coupling.(When an object gets the object to be used from outside)

Java Interface also represents the IS-A relationship.

It cannot be instantiated just like the abstract class.

Till java7, we can only declare methods.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.

note:Multiple inheritance is not supported through class in java, but it is possible by an interface
*/