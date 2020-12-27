package com.revature.eval.java.classes.abstracts;
public class AbstractClassApp {

    public static void main(String[] args) {
    	AbstractAtm atm1 = new AbstractAtm();
        atm1.setId(5);
        
        AbstractBicycle bike1 = new AbstractBicycle();
        bike1.setId(4);
        
        bike1.run();

        //        AbstractMachine machine1 = new AbstractMachine(); // Cannot instantiate abstract class
    }

}
 