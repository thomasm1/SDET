package com.revature.eval.java.classes;

interface Dispenser {
    public void dispense();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Machine machine1 = new Machine() {
            @Override public void start() {
                System.out.println("Coin Machine snapping ..");
            }
        };
        machine1.start();

        Dispenser dispenser1 = new Dispenser() {
            @Override 
            public void dispense() {
                System.out.println("Dispenser interface dispensing");
            }
        };
        dispenser1.dispense();
    } 
}