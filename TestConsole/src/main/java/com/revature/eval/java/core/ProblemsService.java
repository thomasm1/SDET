package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.Map;

public class ProblemsService {

	public static void findPrime(int num) {
		// Prime
		int prime = num;
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0) {
				System.out.println("not prime, divisible by: " + i);
				break;
			}
		}
		System.out.println(num + " is a prime");
	}

	
	public static void reverseWithChar(String str) {
		// Reverse
		String s = str;
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}
		System.out.println(temp);

	}
	public static void swapFloats(float fnum1, float fnum2) {
//		float fnum1 = 1.20f, fnum2 = 2.45f;
		 
		// WITH TEMP 
        System.out.println("First number = " + fnum1);
        System.out.println("Second number = " + fnum2);
        // Value of first is assigned to temporary
        float temporary = fnum1;
        // Value of second is assigned to first
        fnum1 = fnum2;
        // Value of temporary (which contains the initial value of first) is assigned to second
        fnum2 = temporary; 
        System.out.println("\nAFTER\nFirst number = " + fnum1);
        System.out.println("Second number = " + fnum2); 
       
	}

	public static void swapInts(int num1, int num2) {
	 
        // WITHOUT TEMP
        num1 = num1-num2;
        num2 = num1+num2;
        num1 = num2-num1;
        
		System.out.println("num1=" + num1 + ";  num2=" + num2);
	}

	public static void myHashMap(HashMap<Integer, String> map) {

		System.out.println("HashMap");
		map.put(3, "Three Main Str.");
		map.put(1, "One Main Str.");
		map.put(2, "Two Main Str.");
		map.put(4, "Four Main Str.");
		String text = map.get(3);

		System.out.println("\nget keyId 3: " + text);

		for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key + ": " + value);
		}
		System.out.println('\n');
	}

	public static void myLinkedHashMap(Map<Integer, String> map) {
		map.put(5, "Five Main Str.");
		map.put(8, "Eight Main Str.");
		map.put(6, "Six Main Str.");
		map.put(4, "Four Main Str.");
		map.put(2, "Two Main Str.");
		map.put(1, "One Main Str.");
		map.put(9, "Nine  Main Str.");

		System.out.println(" LinkedHashMap");
		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + ": " + value);
		}
		System.out.println('\n');
	}

	public static void myTreeMap(Map<Integer, String> map) {
		map.put(5, "Five Main Str.");
		map.put(8, "Eight Main Str.");
		map.put(6, "Six Main Str.");
		map.put(4, "Four Main Str.");
		map.put(2, "Two Main Str.");
		map.put(1, "One Main Str.");
		map.put(9, "Nine  Main Str.");

		System.out.println(" TreeMap");
		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + ": " + value);
		}
	}
}
