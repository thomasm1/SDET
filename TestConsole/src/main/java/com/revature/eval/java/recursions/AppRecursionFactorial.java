package com.revature.eval.java.recursions;
public class AppRecursionFactorial { 

    public static void main(String[] args) { 
        // 4! = 4*3*2*1 (factorial 4)
        System.out.println(factorial(5));
    }
    
    
    private static int factorial(int value) {
        //System.out.println(value);
        if(value == 1) {
            return 1;
        }
        
        return factorial(value - 1) * value;
    }

}