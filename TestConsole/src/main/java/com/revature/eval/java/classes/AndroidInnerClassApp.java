package com.revature.eval.java.classes;

public class AndroidInnerClassApp {

	public static void main(String[] args) {
		int id = 3;
		double cpu = 3.3;
		AndroidRobot android = new AndroidRobot(id, cpu);
		
		AndroidRobot.Battery bat0 = new AndroidRobot.Battery();
		bat0.charge();
		
//		Battery bat1 = new Battery();
//		bat1.charge();
		System.out.println("\n ---------------\n");
		android.start();
        
        // this here only works if Brain is declared public. (not usual to do htis)
        // Robot.Brain brain = robot.new Brain();
        // brain.think(); 
        
        //  static inner class.
		AndroidRobot.Battery battery = new AndroidRobot.Battery();
        battery.charge();
    }

}
