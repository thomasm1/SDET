package com.revature.eval.java.comparisons;

public class AppOrangeApple {
	
	public static void main(String[] args) {
		System.out.println("apple");
		Apple a1 = new Apple();
		a1.mass = 20;
		a1.sour = false;
		a1.color = "Blue";
		
		Apple a2 = new Apple();
		a2.mass = 20;
		a2.sour = true;
		a2.color = "Blue";
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		
		Orange o = new Orange();
		o.mass = 20;
		System.out.println(a1.equals(o));
		
		/*
		 * You can compare apples to oranges
		 * The equals method is overridden all the time.
		 * second perhaps only to toString.
		 */
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}

}
