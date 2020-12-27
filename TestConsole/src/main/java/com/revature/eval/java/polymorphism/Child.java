package com.revature.eval.java.polymorphism;

public class Child extends Parent {
	String favoritegames;
	
	@Override
	public void work() {
		System.out.println("I'm gonna start a rock band and tour the world");
	}
	public void play() {
		System.out.println("Playing on the playground");
	}
}
