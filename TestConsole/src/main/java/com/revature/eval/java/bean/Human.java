package com.revature.eval.java.bean;

import java.io.Serializable;

public class Human implements Serializable {

	//This is a bean. Has private fields, public
	//getters and setters, and (optionally) implements
	//Serializable
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
