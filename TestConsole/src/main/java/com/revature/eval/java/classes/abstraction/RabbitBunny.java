package com.revature.eval.java.classes.abstraction;

public class RabbitBunny extends Animal implements Petable, Herbivore {
	@Override
	public void makeSound() {
		System.out.println("Squeak");
	}
	@Override
	public void eatPlant() {
		System.out.println("eat clover ");
	}
}
