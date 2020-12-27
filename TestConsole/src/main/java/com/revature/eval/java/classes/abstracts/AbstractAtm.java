package com.revature.eval.java.classes.abstracts;
public class AbstractAtm extends AbstractMachine {

	@Override
	public void start() {
		System.out.println("ATM Starting up Gears");
	}
	
	@Override
	public void functionNow() {
		System.out.println("Processing In Motion");
	}
	
	@Override
	public void stop() {
		System.out.println("ATM Stopping Gears");
	}
}
