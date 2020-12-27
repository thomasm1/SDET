package com.revature.eval.java.threads;

public class ThreadInterfaceMain {
	public static void main(String[] args) {
		try {
			int n = 4;
			for (int i = 0; i < n; i++) {
				Thread myThread = new Thread(new ThreadInterface());
				myThread.start();
			}
		} catch (Exception e) {
			System.out.println("exception " + e);
		}
	}
}
