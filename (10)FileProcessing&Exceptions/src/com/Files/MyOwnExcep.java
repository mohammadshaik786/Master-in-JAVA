package com.Files;

import com.UserExceptions.FooRuntimeExcep;

public class MyOwnExcep {
	
	//created Exception subclass exception
	public int Substract10large(int no) throws FooRuntimeExcep{
		if(no<10){
			throw new FooRuntimeExcep("The no is smaller than 10");
		}
		return no-10;
	}

}
