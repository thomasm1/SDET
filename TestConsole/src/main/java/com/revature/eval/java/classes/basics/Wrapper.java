package com.revature.eval.java.classes.basics;
 
public class Wrapper { 

	public static void main(String[] args) {
		byte bb;
		Integer ii;
		Character cc;
		Short ss;
		Long ll;
		Boolean bool;
		Float ff;
		double d; // primitive version
		Double dd = 0.0;
		Double ddd = new Double("3");
		Double dddd = new Double(3);
		System.out.println(dd + ddd + dddd);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(dd.MAX_VALUE);
		System.out.println(ddd.MAX_VALUE); 
		
		int n1 = 9;
		int n2 = 10;
		Integer n3 = 14;
		Integer n4 = 15;
		add(n3, n4); // Unboxing - object into primitive
		add(n1, n2);
		multiply(n1,n2);
		Integer n5 = 25;
		Integer n6 = 4;
		multiply(n5,n6); //autoboxing : primitive turns into object
		Integer n8 =   994324234; // too large;
		try {
			Math.multiplyExact(n5, n8);
		} catch(ArithmeticException e) {
			System.out.println("Multiplication is too large!");
		}
	}
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static void multiply(Integer num1, Integer num2) {
		System.out.println(num1 * num2);
	}
}