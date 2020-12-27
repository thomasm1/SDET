package com.revature.eval.java.classes;

public class AndroidRobot {
	
	private double cpu = 7;
	private int id = 14;
	
    // Non-static nested classes have access to enclosing class's instance data. like: implement Iterable 
    // can group functionality.

	private class Brain {
		public void think() {
			System.out.println("Android " + id + " has " + cpu + " processing power...\n");
		}
	}

    // static inner classes *do not* have access to instance data.
    // They are like "normal" classes, except that they are grouped within an outer class. 
    // For grouping.
   
	public static class Battery {
		public void charge() {
			System.out.println(" ... Battery charging ...");
		}
	}

   public AndroidRobot(int id, double cpu) {
		this.id = id;
		this.cpu = cpu;
	}
	public void start() {
		System.out.println("Starting android #" + id);
        // Use Brain. don't have an instance of brain
        // until creating one. Instances of brain are 
        // always associated with instances of Robot (the
        // enclosing class).
		Brain brain = new Brain();
		brain.think();
        final String name = "Android TMM-KRS";
        
        //  local classes  within methods. Can use them only within the method.
       
		class Temp {
			public void doChore() {
				System.out.println("ID#" + id + " reporting");
				System.out.println("Greetings, my name is " + name);
				
			}
		}
		Temp temp = new Temp();
		temp.doChore();
    }
}
 