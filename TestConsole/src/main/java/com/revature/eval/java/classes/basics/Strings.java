package com.revature.eval.java.classes.basics;

public class Strings {
	public static void main(String[] args) {
		Integer i1 = 1000;
		Integer i2 = 1000;
		// Whenever you call == with primitives it checks value
		System.out.println(4==4); // true
		System.out.println(i1==i2); // false
		System.out.println(i1.equals(i2)+"\n"); // TRUE bc .equals()  checks values
		// Wenever you call == with objects it checks addresses
		String hello1 = "hello";
		String hello2 = "hello";
		
		System.out.println("hello"=="hello"); // true
		System.out.println(hello1==hello2); // TRUE bc Strings share same location
		String hello3 = new String("hello");
		System.out.println(hello1==hello3); // False bc 'new' memory location Strings share same location
		//
		hello1 = "'Hey'= not changing string, just reassigning, changing location, not changing value."; // not changing string, just reassigning, changing location, not changing value.
		System.out.println("\n"+hello1.toString());
		
		StringBuilder sb = new StringBuilder("Hellow everyone"); // don't have string pool
		sb.reverse();
		System.out.println(sb);

        ///////////////// .append with StringBuilder 
		long timestart = System.currentTimeMillis();
		StringBuilder a = new StringBuilder("a");
		for(int i = 0; i <100000; i++) {
			a.append("a");
		}
		long timeend = System.currentTimeMillis(); 
		System.out.println(timeend - timestart); 
		
	        ///////////////// Concat with String
			long timestart2 = System.currentTimeMillis();
			String a2 = new String("a");
			for(int i = 0; i <100000; i++) {
				// a.append("a");
				//a2 += "a";
				a2.concat("a");  // concat is much faster
			}
			long timeend2 = System.currentTimeMillis();
			System.out.println( timeend2 - timestart2 ); 
				///////////////// += with String
				long timestart1 = System.currentTimeMillis();
				String a1 = new String("a");
				for(int i = 0; i <100000; i++) {
					// a.append("a");
					a1 += "a";
					//a1.concat("a");  // concat is much faster
				}
				long timeend1 = System.currentTimeMillis();
				System.out.println( timeend1 - timestart1 ); 
	}
}
