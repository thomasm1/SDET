package com.revature.eval.java.collections;

import java.util.List;
import java.util.Scanner;

public class LinkedVsArray {

	public static void main(String[] args) {
		// Scanners are used to receive input. That is not 
		// always from a user. However, this is a common
		// reason to use one.
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you prefer retrieval speed (1) or insertion speed (2)? Exit with (0)."); 	
		int number = scan.nextInt(); // INPUT VALIDATION - use loop with nextLine()
		
		while(number != 0) {
		List things = ListFactory.getList(number);
		
		// more precise than currentTimeMillis
		double start= System.nanoTime(); //-> 1/billionth per second.
		// adding 100,000 objects to list
//		number = scan.nextInt();
		
		for(int i = 0; i < 100000; i++) {
			things.add(new Object());
		}
		double end = System.nanoTime(); //-> 1/billionth per second.
		
		System.out.println("time to add 100,000 objs to the end of the list -> "+ ((end - start)/1000000) +" milliseconds");
//		number = scan.nextInt();
		
	///

		
		//Adding 100,000 objects to the list
		start = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			things.add(0, new Object());  // FRONT OF LIST
		}
		end = System.nanoTime();
		System.out.println("Time to add 100,000 objects to the front of the list: " + (end - start)/1000000 + " ms");
		
		
		//Retrieve all 200,000 objects to the list
		start = System.nanoTime();
		for(int i = 0; i < 100000; i++) {
			things.get(i);
		}
		end = System.nanoTime();
		System.out.println("Time to retrieve 200,000 objects from the list: " + (end - start)/1000000 + " ms");
		
		
		System.out.println();
		System.out.println("Would you prefer retrieval speed (1) or insertion speed (2)? Exit with (0)");
		number = scan.nextInt();
	}
	System.out.println("Goodbye!");
	//System.exit(0);
	}

}
