package com.revature.eval.java.comparisons;

import java.util.ArrayList;
import java.util.Collections;

//A class 'ComparableClass' that implements Comparable 
class ComparableClass implements Comparable<ComparableClass> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(ComparableClass m) {
		return this.year - m.year;
	}

	// Constructor
	public ComparableClass(String nm, double rt, int yr) {
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

//Driver class 
public class MovieComparableApp {

	public static void main(String[] args) {
		ArrayList<ComparableClass> list = new ArrayList<ComparableClass>();
		list.add(new ComparableClass("Force Awakens", 8.3, 2015));
		list.add(new ComparableClass("Star Wars", 8.7, 1977));
		list.add(new ComparableClass("Solo", 9.8, 2018));
		list.add(new ComparableClass("The Last Jedi", 9.9, 2019));
		list.add(new ComparableClass("No movie yet - outlier data point", 0.0, 2021));
		list.add(new ComparableClass("Empire Strikes Back", 8.8, 1980));
		list.add(new ComparableClass("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);
 
		System.out.println("ComparableApps after sorting : \n");
		for (ComparableClass movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

	}

}
