package com.revature.eval.java.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wizard {
	String name;
	List<Magic> proficiencies;
	
	public Wizard(String name, Magic ... proficiencies) {
		super();
		this.name = name;
		this.proficiencies = new ArrayList<Magic>();
		this.proficiencies.addAll(Arrays.asList(proficiencies));
	}
	public static void main(String[] args) {
		Magic leviosa = () -> {
			System.out.println("Object flies into air");
		};
		Magic alohamora = () -> {
			System.out.println("The lock is now open!");
		};
		Magic magicmissile = () -> {
			System.out.println("pew-pew!");
		};
		
		Wizard harry = new Wizard("Harry Potter", leviosa);
		harry.proficiencies.get(harry.proficiencies.indexOf(leviosa)).castSpell();
		
		Wizard hermione = new Wizard("Hermione Granger", leviosa, alohamora); // use of varargs
		hermione.proficiencies.get(hermione.proficiencies.indexOf(leviosa)).castSpell();
		hermione.proficiencies.get(hermione.proficiencies.indexOf(alohamora)).castSpell();
		
		Wizard merlin = new Wizard("Merlin", () -> System.out.println("Abra Kadabra, +3 Illusion"));
		merlin.proficiencies.get(0).castSpell();
	}
}
