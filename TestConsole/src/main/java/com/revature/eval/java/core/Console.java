package com.revature.eval.java.core;
 
import com.revature.eval.java.core.ProblemsService.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// temp location for demoing methods
// For Dev only ... Run this file, and choose between methods
public class Console {

	public static void main(String... args) {
		//  get int and str
		int int1 = 0;// 1;
		String str1 = " "; // "100 Central AVenue, 87104";

		try {
			consoleControl(int1, str1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void consoleControl(Integer int1, String str1) throws Exception {
	 
		System.out.println("\n----------------------------------\n" + "(1) findPrime\n" 
		+ "(2) reverseWithChar\n" + "(3) swap w/out temp  \n" + "(4) swapFloats\n"
				+ "(5)  \n" + "(0)  \n " + "----------------------------------");

		try {
			Scanner newScan = new Scanner(System.in);
			boolean hasNextInt = newScan.hasNextInt();
			int val = newScan.nextInt();
			if (val < 0 | val > 5 | !hasNextInt) {
				System.out.println("Please enter valid choices: 0-5");

			} else {
				switch (val) {
				case 1: { 
//					findPrime
					inputInt();
					break;
				}
				case 2: { 
//					reverseWithChar
					inputStr(); 
					break;
				}
				case 3: {
//					swap w/out temp
					inputIntAndInt();
					break;
				}
				case 4: {
//					swapFloats
					inputFloatAndFloat();
					break;
				}
				case 5: {
					HashMap<Integer, String> map = new HashMap<Integer, String>();
					Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
					Map<Integer, String> treeMap = new TreeMap<Integer, String>();

					ProblemsService.myHashMap(map);
					ProblemsService.myLinkedHashMap(linkedHashMap);
					ProblemsService.myTreeMap(treeMap);

					System.out.println(map);
					System.out.println(linkedHashMap);
					System.out.println(treeMap);
					break;
				}
				case 0: {
					newScan.close();
					System.exit(0);

				}
				}

			}

			consoleControl(int1, str1);
		} catch (InputMismatchException e) {
			System.out.println("Oops, Inputs! must choose 1,2,3,4... ");
			consoleControl(int1, str1);
		}
		consoleControl(int1, str1);
	}
///////////////// 
	
	
	public static void inputInt() {
		try {
			System.out.println(" enter integer:");
			Scanner scanner = new Scanner(System.in);
			String number = scanner.next();
			int inte = Integer.parseInt(number);
			ProblemsService.findPrime(inte);
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void inputStr() {
		try {
			System.out.println(" enter word:");
			Scanner scanner = new Scanner(System.in);
			String word = scanner.next();
			ProblemsService.reverseWithChar(word);
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void inputFloatAndFloat() {

		try {
			System.out.println(" enter Float:");
			Scanner scanner = new Scanner(System.in);
			String num1 = scanner.next();

			System.out.println("and 2nd Float");
			String num2 = scanner.next(); 
			
			Float num11 = Float.parseFloat(num1);
			Float num22 = Float.parseFloat(num2);
			
			ProblemsService.swapFloats(num11, num22);
 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void inputIntAndInt() {

		try {
			System.out.println(" enter integer:");
			Scanner scanner = new Scanner(System.in);
			String num1 = scanner.next();

			System.out.println("and 2nd integer");
			String num2 = scanner.next(); 
			
			int num11 = Integer.parseInt(num1);
			int num22 = Integer.parseInt(num2);
			
			ProblemsService.swapInts(num11, num22);
 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void inputIntAndStrings() {

		try {
			System.out.println(" enter integer:");
			Scanner scanner = new Scanner(System.in);
			String userId = scanner.next();

			System.out.println("and string");
			String num = scanner.next();

			System.out.println("and string");
			String userStreet = scanner.next();

			System.out.println("and string");
			String zip = scanner.next();

			String strAddress = num + " " + userStreet + " " + zip;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
/////////////////////// METHODS

}
