package com.revature.eval.java.comparisons;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	
	String name;
	int age;
	int height;
	
	public Person(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public Person() {
		super();
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Person p) {
		
		if(this.age < p.age) {
			return -1;
			//-1 means that this instance of Person
			//is 'smaller' that the person I am
			//comparing to
		}
		else if(this.age > p.age) {
			return 1;
			//+1 means that this instance of person
			//is 'larger' than the person I am
			//comparing to
		} else {
			return 0;
		}
	}
	
	public static Comparator<Person> HeightComparator = new Comparator<Person>() {
		
		public int compare(Person p1, Person p2) {
			if(p1.height < p2.height) 
				return -1;
			else if(p1.height > p2.height)
				return 1;
			else
				return 0;
		}
		
	};

}
