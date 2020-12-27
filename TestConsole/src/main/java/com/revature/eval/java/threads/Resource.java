package com.revature.eval.java.threads;

public class Resource {
	static Integer number = 0;
	
	public synchronized static void change(int num, int delay) {
		try {
			System.out.println(Thread.currentThread());
			Thread.sleep(delay);// simulate code taking time to do somthingn
			number = num;
			System.out.println(number);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
