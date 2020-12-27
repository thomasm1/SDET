package com.revature.eval.java.classes.abstraction;

public class Human extends Animal implements Herbivore, Carnivore {

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub
		System.out.println("eats steak with fork and knife");
		
	} 
	@Override 
	public void makeSound() {
		System.out.println("Hello World!");
	} 
	@Override
	public void eatPlant() {
		System.out.println("make salad");
	}
}
