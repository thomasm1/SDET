package com.revature.eval.java.io;
// same as BufferedTryWithResources but with write
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterApp {

    public static void main(String[] args) {
        File file = new File("testwrite.txt");

        try (BufferedWriter bufferedW = new BufferedWriter(new FileWriter(file))) {
            bufferedW.write("writing line 1");
            bufferedW.newLine();
            bufferedW.write("and line 2");
            bufferedW.newLine();
            bufferedW.write("last line");
            // String line;
            // while ((line = bufferedW.readLine()) != null) {
            //     System.out.println(line);
            // } 
        // } catch (FileNotFoundException e) {
        //     System.out.println("File not found: " + file.toString());
        
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}