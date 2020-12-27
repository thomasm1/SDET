package com.revature.eval.java.polymorphism;

public class PolymorphCalculator {
public static void main(String[] args) {
	System.out.println(add(5,10));	
	System.out.println(add(5,10,15));
	System.out.println(add());
	
	System.out.println(add("3", "4"));
	System.out.println(add("3", 5));
	System.out.println(add(8, "3"));
	System.out.println(add(3.7, 3.6));
	System.out.println(add(3d, 3.5d));
}
public static int add(int num1, int num2) {
	return num1 + num2;
}
public static int add(int num1, int num2, int num3) {
	return num1 + num2 + num3;
}
public static int add() {
	return 0;
}
public static int add(String num1, String num2) {
	// return num1 + num2; // cannot return string 
	// return (int) num1; // not allowed for non-primitives (Strings not primitive)
	return Integer.parseInt(num1) + Integer.parseInt(num2);
}
public static int add(String num1, int num2) {
	return Integer.parseInt(num1) + num2;
}
public static int add(int num1, String num2) {
	return num1 +  Integer.parseInt(num2);
}
public static double add(double num1, double num2) {
	return num1 + num2;
}
}
