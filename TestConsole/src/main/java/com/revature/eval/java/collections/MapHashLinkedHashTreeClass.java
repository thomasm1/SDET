package com.revature.eval.java.collections;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapHashLinkedHashTreeClass {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        myHashMap(hashMap);
        myLinkedHashMap(linkedHashMap);
        myTreeMap(treeMap);
    }

    public static void myHashMap(Map<Integer, String> map) {
        map.put(9, "eth");
        map.put(4, "btc");
        map.put(8, "ltc");
        map.put(1, "xrp");
        map.put(0, "bch");
        map.put(15, "xlm");
        map.put(6, "eos");
        map.put(7, "usdt");
        String text = map.get(6); 
        System.out.println("map.get(6) " +text);
        System.out.println(" HashMap");
        for(Integer key: map.keySet()) {
            String value = map.get(key);
            
            System.out.println(key + ": " + value);
        }
        System.out.println('\n');
    }
    public static void myLinkedHashMap(Map<Integer, String> map) {
        map.put(9, "eth");
        map.put(4, "btc");
        map.put(8, "ltc");
        map.put(1, "xrp");
        map.put(0, "bch");
        map.put(15, "xlm");
        map.put(6, "eos");
        map.put(7, "usdt");

        System.out.println(" LinkedHashMap");
        for(Integer key: map.keySet()) {
            String value = map.get(key);
            
            System.out.println(key + ": " + value);
        }
        System.out.println('\n');
    }
    public static void myTreeMap(Map<Integer, String> map) {
        map.put(9, "eth");
        map.put(4, "btc");
        map.put(8, "ltc");
        map.put(1, "xrp");
        map.put(0, "bch");
        map.put(15, "xlm");
        map.put(6, "eos");
        map.put(7, "usdt");

        System.out.println(" TreeMap");
        for(Integer key: map.keySet()) {
            String value = map.get(key);
            
            System.out.println(key + ": " + value);
        }
        System.out.println('\n');
    }
}
