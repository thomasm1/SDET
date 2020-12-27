package com.revature.eval.java.classes;

class MachineCast {
    public void start() {
        System.out.println("MachineCast started");
    }
}
class AtmCast  extends MachineCast {
    public void start() {
        System.out.println("AtmCast started");
    }
    public void chaChing() {
        System.out.println("cha-ching!");
    }
} 

public class UpCastDownCast {
    public static void main(String[] args) {

        MachineCast machine1 = new MachineCast();
        AtmCast atm1 = new AtmCast();

        machine1.start();  // MachineCast started
        atm1.start();  // AtmCast started
        atm1.chaChing(); // cha-ching!

        // Upcasting   - is casting a subtype to a supertype, upward to the inheritance tree. 
        MachineCast machine2 = atm1;
        // machine2.chaChing(); //  ERROR
        System.out.println("\nMachineCast machine2 = atm1;\n// Upcasting machine2.start(); \n");
        machine2.start();

        // Downcasting -   is casting to a subtype, downward to the inheritance tree. 
        // Use downcasting when we want to access specific behaviors of a subtype.
        MachineCast machine3 = new AtmCast();
        AtmCast atm2 = (AtmCast)machine3;
        atm2.start();
        atm2.chaChing();

        MachineCast machine4 = new MachineCast();
        // AtmCast atm3 = (AtmCast)machine4;    // RUNTIME ERROR
        // atm3.start();             // RUNTIME ERROR
        // atm3.chaChing();         // RUNTIME ERROR
         
    }   
    
}