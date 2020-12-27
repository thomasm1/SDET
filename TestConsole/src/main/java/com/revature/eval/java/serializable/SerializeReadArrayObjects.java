package com.revature.eval.java.serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SerializeReadArrayObjects {

    public static void main(String[] args) {
        System.out.println("Reading objects");
        
        try (FileInputStream fi = new FileInputStream("test.ser");
        		ObjectInputStream os = new ObjectInputStream(fi)) {
 
            Coin[] coins = (Coin[])os.readObject();  // Read entire array
             
            @SuppressWarnings("unchecked")
            ArrayList<Coin> coinsList = (ArrayList<Coin>)os.readObject();   // Read entire arraylist
            
            for(Coin coin: coins) {
                System.out.println(coin);
            }
            
            for(Coin coin: coinsList) {
                System.out.println(coin);
            }
             
            int num = os.readInt();  // Reading objects one by one.
            
            for(int i=0; i<num; i++) {
                Coin coin = (Coin)os.readObject();
                System.out.println(coin);
            }
            
        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }

    }

}
 