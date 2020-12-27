package com.revature.eval.java.collections;
 
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetHashLinkedHashTreeClass {

   public static void main(String[] args) {

       // HashSet does not retain order.
       Set<String> myHashSet = new HashSet<String>();

       // LinkedHashSet remembers the order you added items in
       Set<String> myLinkedHashSet= new LinkedHashSet<String>();

       // TreeSet sorts in natural order
       Set<String> myTreeSet = new TreeSet<String>();

       if (myTreeSet.isEmpty()) {
           System.out.println("Set is empty at start");
       }
       System.out.println('\n');

       myTreeSet.add("xrp");
       myTreeSet.add("btc");
       
       myTreeSet.add("bch");
       myTreeSet.add("trx");
       myTreeSet.add("xrp");

       if (myTreeSet.isEmpty()) {
           System.out.println("Set is empty after adding (no!)");
       }

       // Adding duplicate items does nothing.
       myTreeSet.add("bch");

       System.out.println("tree set  ");
       System.out.println(myTreeSet);
       System.out.println('\n');

       // ///////// Iteration ////////////////

       System.out.println("//// Iteration-- for (String element : myTreeSet)");
       for (String element : myTreeSet) {
           System.out.println(element);
       }
       System.out.println('\n');

       // ////////// Does set contains a given item? //////////
       if (myTreeSet.contains("atom")) {
           System.out.println("Contains atom");
       }

       if (myTreeSet.contains("btc")) {
           System.out.println("Contains btc");
       }
       System.out.println('\n');

       /// setTreeSet2 contains some common elements with setTreeSet, and some new

       Set<String> setTreeSet2 = new TreeSet<String>();

       setTreeSet2.add("xrp");
       setTreeSet2.add("btc");
       
       setTreeSet2.add("usdt");
       setTreeSet2.add("ltc");
       setTreeSet2.add("eos");
       
       ////////////// Intersection ///////////////////
       
       Set<String> intersection = new HashSet<String>(myTreeSet);
       
       intersection.retainAll(setTreeSet2);

       System.out.println("//// Intersection");
       System.out.println(intersection);
       System.out.println('\n');
       
       ////////////// Difference /////////////////////////
       
       Set<String> difference = new HashSet<String>(setTreeSet2);
       
       difference.removeAll(myTreeSet);
       System.out.println("//// Difference");
       System.out.println(difference);
   }
}

//  Set is empty at start


// tree set  
// [bch, btc, trx, xrp]


// //// Iteration-- for (String element : myTreeSet)
// bch
// btc
// trx
// xrp


// Contains btc


// //// Intersection
// [btc, xrp]


// //// Difference
// [eos, usdt, ltc]

