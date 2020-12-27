package com.revature.eval.java.classes.basics;

class Animal {
	
	public void speak() {
		System.out.println("\"generic animal sounds!\"");
	}
}

class Dog extends Animal {
	public void speak() {
		System.out.println("Woof!");
	}
	
	public void beg() {
		System.out.println("The dog looks cute for food.");
	}
}


public class InheritanceTest {

	public static void saySomething(Animal a) {
		a.speak();
		
		if (a instanceof Dog)
			((Dog) a).beg();
	}
	
	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		Dog myDog = new Dog();
		
		saySomething(myAnimal);
		saySomething(myDog);

	}

}
