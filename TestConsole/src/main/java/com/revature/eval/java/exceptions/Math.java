package com.revature.eval.java.exceptions; 

import java.util.Random;
import java.util.InputMismatchException;

public class Math  {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 1;
		
		try {
			
			//System.exit(0);
			
			int result = x/y;
			//Math.addExact(Integer.MAX_VALUE, 1);
			throw new InputMismatchException();
			
		} catch(ArithmeticException e) {
			if(y == 0)
				System.out.println("You divided by 0!");
			e.printStackTrace();
		} catch(InputMismatchException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This code will always execute");
		}
		
	}
	public static double random() {
		  // create instance of Random class 
        Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000); 
        int rand_int2 = rand.nextInt(1000); 
  
        // Print random integers 
        System.out.println("Random Integers: "+rand_int1); 
        System.out.println("Random Integers: "+rand_int2); 
  
        // Generate Random doubles 
        double rand_dub1 = rand.nextDouble(); 
        double rand_dub2 = rand.nextDouble(); 
  
        // Print random doubles 
        System.out.println("Random Doubles: "+rand_dub1); 
        System.out.println("Random Doubles: "+rand_dub2);
		return rand_dub2; 
	}
}
