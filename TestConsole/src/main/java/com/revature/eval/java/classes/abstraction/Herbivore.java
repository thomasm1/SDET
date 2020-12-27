package com.revature.eval.java.classes.abstraction;

public interface Herbivore {
	// All interfaces can have variables 
	// *but* they must all be public static final
	// even if not explicitely stated.
	int num = 100; // must be initialized
	
	public default void eatPlant() {
		System.out.println("Eats plants. Yum"); // default methods
	}
	
}
