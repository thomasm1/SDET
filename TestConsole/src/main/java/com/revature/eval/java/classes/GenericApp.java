package com.revature.eval.java.classes;


import java.util.ArrayList;

class Machine {
    @Override
    public String toString() {
        return "I'm the Machine";
    }
    public void start() {
        System.out.println("Machine starting");
        }
}

class Atm extends Machine {
    @Override
    public String toString() {
        return "I'm the Atm";
    }
    public void chaChing() {
        System.out.println("Cha-Ching!"); 
    }
}

public class GenericApp {
    public static void main(String[] args) {

        //ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Machine> list1 = new ArrayList<Machine>();

        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Atm> list2 = new ArrayList<Atm>();

        list2.add(new Atm());
        list2.add(new Atm());

        showList(list2);
        showList2(list1);
        showList3(list1);
    } 
    private static void showList3(ArrayList<Machine> list1) {
		// TODO Auto-generated method stub
		
	}
	public static void showList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }
    }
    public static void showList2(ArrayList<? super Atm> list) { 
          for (Object value : list) {
            System.out.println(value); 
        }
    }
    
}