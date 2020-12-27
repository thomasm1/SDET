package com.revature.eval.java.classes.basics;

public class WhileLoopTest {

	public static void main(String[] args) {
		
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		
		count = 1;
		do {
			System.out.println("count is: " + count);
		} while (count == 0);
		
	}
}
