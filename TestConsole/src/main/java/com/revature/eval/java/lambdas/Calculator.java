package com.revature.eval.java.lambdas;

public class Calculator {

	public static void main(String[] args) {
		
		Calculable add = (x,y) -> {
			System.out.println("adding 2 numbers");
			return (x + y);
		};
		Calculable multiply = (x,y) -> {
			System.out.println("multiplying 2");
			return (x*y);
		};
		System.out.println(add.calculate(99,91));
		System.out.println(multiply.calculate(99,91));
		
	}

}
