package com.revature.eval.java.exceptions; 
public class Casino {

	public static void main(String[] args) {
		
		double luck = Math.random();
		System.out.println(luck);
		
		
		try {
			gamble(luck);
		
		} catch (LostMoneyException e) {
			System.out.println(e.getMessage());
		}
		
		for(int i = 0; i < 10; i++) {
			luck = Math.random();
			System.out.println(luck);
			try {
				gamble(luck);
			} catch (LostMoneyException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void gamble(double number) throws LostMoneyException {
		
		if(number > 0.7) {
			System.out.println("Congratulations you won money!");
		}
		else {
			throw new LostMoneyException();
		}
	}
}
