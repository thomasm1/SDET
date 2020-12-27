package com.revature.eval.java.classes.abstracts;
public abstract class AbstractMachine {
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public abstract void start();
	public abstract void functionNow();
	public abstract void stop();
	
	public void run() {
		System.out.println("id #"+ id+" machine at your service ...");
		start();
		functionNow();
		stop();
	}
}
