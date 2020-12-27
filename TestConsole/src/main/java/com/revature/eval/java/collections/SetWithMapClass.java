package com.revature.eval.java.collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Coin {
   private int id;
   private String symbol;
   
   public Coin(int id, String symbol) {
       this.id = id;
       this.symbol = symbol;
   }
   
   public String toString() {
       return "{ID is: " + id + "; Symbol is: " + symbol + "}";
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + id;
       result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
       return result;
   }

   @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;
       final Coin other = (Coin) obj;
       if (id != other.id)
           return false;
       if (symbol == null) {
           if (other.symbol != null)
               return false;
       } else if (!symbol.equals(other.symbol))
           return false;
       return true;
   }
   
   
}


public class SetWithMapClass {

   public static void main(String[] args) {
       
       Coin p1 = new Coin(0, "BTC");
       Coin p2 = new Coin(1, "ETH");
       Coin p3 = new Coin(2, "XRP");
       Coin p4 = new Coin(1, "ETH");
       
       Map<Coin, Integer> map = new LinkedHashMap<Coin, Integer>();
       
       map.put(p1, 1);
       map.put(p2, 2);
       map.put(p3, 3);
       map.put(p4, 1);

       System.out.println("(      key           :    map.get(key) )");
       System.out.println("--------------------");
       for(Coin key: map.keySet()) {
           System.out.println(key + ": " + map.get(key));
       }
       System.out.println('\n');
       
       Set<Coin> set = new LinkedHashSet<Coin>();
       
       set.add(p1);
       set.add(p2);
       set.add(p3);
       set.add(p4);

       System.out.println("        set");
       System.out.println("--------------------"); 
       System.out.println(set);
   }

}
//for(Coin key: map.keySet()) {   
// System.out.println(      key +              ": "  + map.get(key));       }
//              {ID is: 0; symbol is: BTC}   :               1
//{ID is: 1; symbol is: ETH}: 1
//{ID is: 2; symbol is: XRP}: 3

//System.out.println(set);
//[{ID is: 0; symbol is: BTC}, {ID is: 1; symbol is: ETH}, {ID is: 2; symbol is: XRP}]