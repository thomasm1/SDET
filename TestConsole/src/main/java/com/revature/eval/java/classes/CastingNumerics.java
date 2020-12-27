package com.revature.eval.java.classes;


public class CastingNumerics {
    /**
    * @param args
    */
    public static void main(String[] args) {
        byte byteValue = 20;   // 8 bytes
        short shortValue = 55;   // 16 bytes
        int intValue = 777;         // 32 bytes
        long longValue = 23444;     // 64 bytes

        float floatValue = 8883.4f;   
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;  
        System.out.println(intValue); // 23444 watch size

        doubleValue = intValue;
        System.out.println(doubleValue); // 777.0

        intValue = (int)floatValue;
        System.out.println(intValue); // 8883

        byteValue = (byte)128;  /// BAD!
        System.out.println(byteValue);   ///.... -128
    }
}