package com.revature.eval.java.classes.basics;

public class Scopes {

	//Java does not have a Global Scope!!!
	
	/*
	 * class/static scope: the variable or method belongs
	 * to the class and not to any particular instance
	 * of the class
	 */
	
	static int staticnum = 10;
	
	// instance/object scope means that the variable/method
	// is attached to a particular object.
	
	int instancenum = 100;
	
	/*
	 * method scope are all variables created/initialized
	 * in a method. These do not leave the method.
	 */
	public void method(int number) {
		
		int methodnum = 5;
		
		//block scope
		if(true) {
			int blocknum = 9;
			blocknum = 8;
			System.out.println(blocknum);
		}
		// System.out.println(blocknum);
		 
		System.out.println(methodnum);
	}
}
 
