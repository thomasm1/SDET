package com.revature.eval.java.bean;

public class CorvetteApp {

	public static void main(String[] args) {
		
		Corvette c = new Corvette();
		c.model = "Corvette Stingray";
		//c.year = 1999;
		c.setYear(99999);
		System.out.println(c.model);
		System.out.println(c.getYear());
	}
}