package com.revature.eval.java.classes.abstraction;

import java.util.ArrayList;
import java.util.List;

public class JungleApp {
	public static void main(String[] args) {
		// Cannot make just an animal
		// Animal a = new Animal();  abstarct class
		Lion leo  = new Lion(); // 
		
		// Java only knows this object has methods
		// declared within the Animal class
		// despite that fact that it has other methods as well
		System.out.println("\n-----Animal object implemented as Human ");
		Animal human = new Human(); // Animal object implemented as Human, so human implementations
		human.makeSound();
		human.eat();
		
		System.out.println("\n-----Carnivore Object implemented as a human  ");
		Carnivore human2 = new Human();
		human2.eatMeat();  // Carnivore Object implemented as a human, so human implementation, but Carnivore limitations.
		 
		Human human3 = new Human();
		System.out.println("\n---HUMAN---HUMAN ");
		human3.makeSound();
		human3.eat();
		human3.eatMeat();
		human3.eatPlant();
		System.out.println(human.species);
//		System.out.println(human.num);

		System.out.println("\n---List<Carnivore> meateaters = new ArrayList<Carnivore>();");
		List<Carnivore> meateaters = new ArrayList<Carnivore>();
		meateaters.add(leo);
		// meateaters.add(human); this is *NOT ok* bc Animal object, implementing Human
		meateaters.add(human2); // this ok because Carnivore object, implementing human
		meateaters.add(human3); // this ok because Human object implements Carnivore.
		
		System.out.println("\nfor enhanced of Carnivore c: meateaters");
		for(Carnivore c: meateaters) {
			c.eatMeat();
		}
		RabbitBunny b = new RabbitBunny();
		TeddyBear tb = new TeddyBear();
		
		System.out.println("\nfor enhanced Petable");
		List<Petable> cutestuff = new ArrayList<Petable>();
		cutestuff.add(b);
		cutestuff.add(tb);
		
		for(Petable p : cutestuff) {
			// Being Petable does not add any states or behaviors!
			System.out.println(p);
		}
	}
}
