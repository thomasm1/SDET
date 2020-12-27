package com.revature.eval.java.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTryWithResources  {

    public static void main(String[] args) {
        File file = new File("src.main.java.resources/files/test.txt");

        try (BufferedReader bufferedR = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedR.readLine()) != null) {
                System.out.println(line);
            } 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
 
 