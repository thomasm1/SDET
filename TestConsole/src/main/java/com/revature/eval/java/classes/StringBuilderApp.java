package com.revature.eval.java.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        String info = "";

        info += "This is";
        info += " ";
        info += "not Efficient"  ;
        System.out.println(info);

        StringBuilder sb = new StringBuilder("");  // not thread-safe; StringBuffer() is thread-safe)
        sb.append("This")
        .append(" ")
        .append("much more Efficient");

        System.out.println(sb.toString());

        //FORMATTING
        System.out.print("Tab\t and Line\n");
        System.out.printf("Total cost %-10d; quantitity is %d\n", 5, 120);
        
        // Integers
        for (int i = 0; i<20; i++) {
            System.out.printf("%2d: some text here\n", i);
        }  

        // Floating
        System.out.printf("Total value: %.2f\n", 5.6455);  // Total value: 5.65
        System.out.printf("Total value: %-6.1f\n", 342.3444312);  // Total value: 342.3
        
        
    }
}