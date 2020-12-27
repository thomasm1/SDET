package com.revature.eval.java.serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeWriteArrayObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects..."); 
        
        Coin[] coins = {new Coin(1, "Bitcoin"), new Coin(99, "Litecoin"), new Coin(7, "Ethereum")};
        
        ArrayList<Coin> coinsList = new ArrayList<Coin>(Arrays.asList(coins));

        try (FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {
 
            os.writeObject(coins); // Write entire array
             
            os.writeObject(coinsList);   // Write arraylist
            
            os.writeInt(coinsList.size());  // Write objects one by one
            
            for(Coin coin: coinsList) {
                os.writeObject(coin);
            }
            
            
        } catch (FileNotFoundException e) { 

            e.printStackTrace();
        } catch (IOException e) { 

            e.printStackTrace();
        }
    
    }

} 
 