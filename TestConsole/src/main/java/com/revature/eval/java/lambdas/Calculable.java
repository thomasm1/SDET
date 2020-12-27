package com.revature.eval.java.lambdas;
//This is an optional annotation to add.
//prevents compiling if there is another abstract method in here
@FunctionalInterface
public interface Calculable {
	
	// thismethod is designed to take 2 numbers, return one in return.
	double calculate(double num1, double num2);
	
	default void hello() {
		System.out.println("2nd method (default)");
	}
}
