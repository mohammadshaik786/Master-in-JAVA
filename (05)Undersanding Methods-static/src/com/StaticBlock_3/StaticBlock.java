package com.StaticBlock_3;

class StaticBlock {
	static {
		System.out.println("static block is invoked");
	}

	public static void main(String args[]) {
		System.out.println("Hello main");
	}
}

/*
 * Is used to initialize the static data member. It is executed before the main
   method at the time of classloading.
 */