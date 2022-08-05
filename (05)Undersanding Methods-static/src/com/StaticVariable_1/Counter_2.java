package com.StaticVariable_1;

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counter_2 {
	int count = 0;// will get memory each time when the instance is created
	//static int count = 0;
	Counter_2() {
		count++;// incrementing value
		System.out.println(count);
	}

	public static void main(String args[]) {
		// Creating objects
		Counter_2 c1 = new Counter_2();
		Counter_2 c2 = new Counter_2();
		Counter_2 c3 = new Counter_2();
	}
}


/*
The static variable gets memory only once in the class area at the time of
class loading.
*/