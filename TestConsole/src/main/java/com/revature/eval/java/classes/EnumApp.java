package com.revature.eval.java.classes;

public class EnumApp {
    
    public static void main(String[] args) {
        
    	EnumCoinSet coin = EnumCoinSet.ETH;
        
        switch(coin) {
        case BTC:
            System.out.println("Bitcoin");
            break;
        case ETH:
            System.out.println("Ethereum");
            break;
        case LTC:
            System.out.println("Litecoin");
            break;
        default:
            break;

        }
        
        System.out.println(EnumCoinSet.ETH);
        System.out.println("Enum symbol as a string: " + EnumCoinSet.ETH.getSymbol());
        
        System.out.println(EnumCoinSet.ETH.getClass());

        System.out.println("\nEnumCoinSet.ETH instanceof Enum....?");
        System.out.println(EnumCoinSet.ETH instanceof Enum);
        
        System.out.println(EnumCoinSet.LTC.getSymbol());
        
        EnumCoinSet coin2 = EnumCoinSet.valueOf("BTC");
        
        System.out.println(coin2);
    }

}
