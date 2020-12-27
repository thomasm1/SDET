package com.revature.eval.java.polymorphism;

public class Playground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.work();
		
		Child c = new Child();
		c.play();  // overridden method
		c.work();
		
		// Casting (not necessarily type-casting)
		Parent pc = new Child(); // Parent is a Parent Object 'acting as' 'type-casted' as a child
		pc.work(); // will have Child's implementation of methods
//		pc.play(); // will have Child's implementation of methods
//		pc.favoritegames;
		
		// valid type-casting! pc is now full-on Child object...
		Child c2 = (Child) pc; // knows all about child class, but has method limitations of parent
		//Child c3 = (Child) p; //  parent knows nothing about child class
		
		Parent p2 = (Parent) c;
		p2.work(); // still has implementation as a child
		
		double d = 3.3;
		int i = (int) d; // d is type-cast as integer;
		System.out.println(i);
	}

}
