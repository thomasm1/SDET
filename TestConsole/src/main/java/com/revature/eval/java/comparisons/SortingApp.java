package com.revature.eval.java.comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingApp {

	public static void main(String[] args) {
		
		Person ryan = new Person("Ryan", 305, 350);
		Person brendan = new Person("Brendan", 405, 450);
		Person bertrick = new Person("Bertrick", 205, 250);
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(ryan);
		people.add(brendan);
		people.add(bertrick);
		people.add(ryan);
		
		System.out.println(people);
		
		Set<Person> peopleset = new HashSet<Person>();
		
		peopleset.addAll(people);
		System.out.println(peopleset);
		
		//*********
		
		System.out.println(brendan.compareTo(ryan));
		
		//natural ordering uses Comparable
		Collections.sort(people);
		System.out.println(people);
		
		
		System.out.println(Person.HeightComparator.compare(brendan, bertrick));
		
		Collections.sort(people, Person.HeightComparator);
		System.out.println(people);
		
		people.sort(Person.HeightComparator);
	}
}
