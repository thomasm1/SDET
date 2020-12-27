package com.revature.eval.java.comparisons;

//A Java program to demonstrate Comparator interface 
import java.io.*;
import java.util.*;

//A class 'Magazine' that implements Comparable 
class Magazine // implements Comparable<Magazine>
{
	private double rating;
	private String name;
	private int year;

//	// Used to sort magazines by year 
//	public int compareTo(Magazine m) 
//	{ 
//		return this.year - m.year; 
//	} 

	// Constructor
	public Magazine(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}

// NEW class to compare Magazines by year  
class YearCompare implements Comparator<Magazine> {
	public int compare(Magazine y1, Magazine y2) {
		if (y1.getYear() < y2.getYear())
			return -1;
		if (y1.getYear() > y2.getYear())
			return 1;
		else
			return 0;

	}
}

//Class to compare Magazines by ratings 
class RatingCompare implements Comparator<Magazine> {
	public int compare(Magazine m1, Magazine m2) {
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
}

//Class to compare Magazines by name 
class NameCompare implements Comparator<Magazine> {
	public int compare(Magazine m1, Magazine m2) {
		return m1.getName().compareTo(m2.getName()); //  compareTo !!!
	}
}

//Driver class 
public class MagazineComparator {
	public static void main(String[] args) 
	{ 
		ArrayList<Magazine> list = new ArrayList<Magazine>(); 
		list.add(new Magazine("The Economist", 8.3, 1843)); 
		list.add(new Magazine("Time Magazine", 8.7, 1923));  
		list.add(new Magazine("The New Republic", 8.4, 1914)); 
		list.add(new Magazine("The New Yorker", 8.8, 1925)); 
		list.add(new Magazine("Wired", 8.4, 1993)); 
		list.add(new Magazine("NewsWeek", 8.4, 1933)); 

		// Call overloaded sort method with RatingCompare 
		// Sort by rating : (1) Create an object of ratingCompare 
		//				 (2) Call Collections.sort 
		//				 (3) Print Sorted list 
		System.out.println("Sorted by rating"); 
		RatingCompare ratingCompare = new RatingCompare(); 
		
		Collections.sort(list, ratingCompare); 
		for (Magazine magazine: list) 
			System.out.println(magazine.getRating() + " " + 
							magazine.getName() + " " + 
							magazine.getYear()); 

		// Call overloaded sort method with RatingCompare 
		// Sort by rating : (1) Create an object of ratingCompare 
		//				 (2) Call Collections.sort 
		//				 (3) Print Sorted list 
		System.out.println("\nSorted by name"); 
		NameCompare nameCompare = new NameCompare(); 
		
		Collections.sort(list, nameCompare); 
		for (Magazine magazine: list) 
			System.out.println(magazine.getName() + " " + 
							magazine.getRating() + " " + 
							magazine.getYear()); 

		// Call overloaded sort method with YearCompare 
		// Sort by rating : (1) Create an object of ratingCompare 
		//				 (2) Call Collections.sort 
		//				 (3) Print Sorted list 
		System.out.println("\nSorted by year"); 
		YearCompare yearCompare = new YearCompare();
		
		Collections.sort(list, yearCompare); 
		for (Magazine magazine: list) 
			System.out.println(magazine.getYear() + " " + 
							magazine.getRating() + " " + 
							magazine.getName()+" "); 
	}
}
