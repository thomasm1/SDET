package com.revature.eval.java.io;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderApp {

    public static void main(String[] args) {

        File fileBuff = new File("files/exceptionBuffered.txt");
        
        BufferedReader buffReader = null;
        
        try {
            FileReader fReader = new FileReader(fileBuff);
            buffReader = new BufferedReader(fReader);
            
            String line;
            
            while( (line = buffReader.readLine()) != null ) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Oops ... file not found: " + fileBuff.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + fileBuff.toString());
        }
        finally {
            try {
                buffReader.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + fileBuff.toString());
            }
            catch(NullPointerException ex) {
                // (File probably never opened...)
            }
        }
        
        

    }

}
