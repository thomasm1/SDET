package com.revature.eval.java.threads;

public class App {

	/* Runnable interface is a functional interface.
	 * therefore only 1 abstract method	 */
	public static void main(String[] args) {
		
		Runnable task0 = () -> {
			Resource.change(1, 5000);
		};
		Runnable task1 = () -> {
			Resource.change(2, 1000);
		};
		double start = System.currentTimeMillis();
		System.out.println("time"+ (start/1000000));
		
		Thread thread0 = new Thread(task0);
		Thread thread1 = new Thread(task1);
		double end = System.currentTimeMillis();
		
		thread0.start();
		thread1.start();

		System.out.println("time"+ (end/1000000));
	}

}
