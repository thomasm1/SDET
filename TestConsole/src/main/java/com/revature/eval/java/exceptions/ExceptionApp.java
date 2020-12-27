package com.revature.eval.java.exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionApp {
    
	//public static void main(String[] args) throws FileNotFoundException {
      public static void main(String[] args)  { 
       
        File file = new File("files/exception.txt");
        
        try{
            FileReader fr = new FileReader(file);
            System.out.println("continuing ..");
        }   catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("File not found: " + file.toString());
        }
        System.out.println("Finished.");
    } 
}