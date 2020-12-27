package com.revature.eval.java.classes.basics;

public class Primitives {

	/*
	 * Multi Line Comment
	 */
	/**
	 * Javadoc Comment Above a method
	 */
	byte y = 12; // 8 bits
	short s = 4000; // 16 bits
	char c = 'h'; // 16 bits
	int i = 2000000;// 32 bits 2^31 - 1 positive integers
	float f = 2.5f; // 32 bits
	double d = 3.5; // 64 bits
	long l = 3; // 64 bits 2^64 integers

	boolean b = false;

	public static void main(String[] args) {

		int num1 = 100;
		double num2 = num1;
		num2 = 100.9;
		num1 = (int) num2;
		num2 = num2 - (int) num2;

		System.out.println(num2);
		System.out.println(num1);

		System.out.println(0.1 + 0.2);
	}
}