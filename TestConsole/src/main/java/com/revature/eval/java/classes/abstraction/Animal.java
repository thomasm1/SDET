package com.revature.eval.java.classes.abstraction;

public abstract class Animal {

	/*
	 * An abstract class can have any variables of any type.
	 * It can have as many or as few abstract or 
	 * concrete methods as you like.
	 */
	
	String species;
	
	public void eat() {
		System.out.println("The animal is eating something");
	}
	
	/*
	 * You do not have to have implementations of methods
	 * in an abstract class. If you want a method that should
	 * always be overridden or implemented in a child class
	 * you should make the method abstract.
	 */
	
	public abstract void makeSound();
	
	//There are no abstract variables
}
