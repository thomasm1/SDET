package com.revature.eval.java.classes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListApp { 
        public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

            // xx -> Adding
            numbers.add(10);
            numbers.add(100);
            numbers.add(40);

            // xx -> Retrieving
            System.out.println(numbers.get(0));

            System.out.println("nIteration #1: ");

            // Indexed for loop iteration
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i));
            }

            // Removing items  - PELIGROSO
            numbers.remove(numbers.size() - 1);

            // VERY SLOW 
            numbers.remove(0);

        System.out.println("nIteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }

        // List interface ...
        List<String> values = new ArrayList<String>();
    

        // BEFORE JAVA 5
        
        ArrayList list1	  = new ArrayList();

        list1.add("LTC");
        list1.add("BTC");
        list1.add("ETH");   
        
        String coins = (String)list1.get(1);
        char[] fruit;
		System.out.println(coins);

        // Modern
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("plan-A");
        strings.add("plan-B");
        strings.add("plan-C");

        String planner = strings.get(1);

        System.out.println(planner);

        // More than one argument
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Java 7 
        ArrayList<AndroidRobot> planningList = new ArrayList<>();
        }
}

 