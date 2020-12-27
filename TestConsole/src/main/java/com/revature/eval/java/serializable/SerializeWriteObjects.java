package com.revature.eval.java.serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream; 

public class SerializeWriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects...");

        SerializeObjectCoin BTC = new SerializeObjectCoin(543, "Bitcoin", "BTC");
        SerializeObjectCoin LTC = new SerializeObjectCoin(123, "LiteCoin", "LTC");
        SerializeObjectCoin ETH = new SerializeObjectCoin(123, "Ethereum", "ETH");
        
        System.out.println(BTC);
        System.out.println(LTC);
        System.out.println(ETH);
        
        try(FileOutputStream fs = new FileOutputStream("coins.bin")) {
            
            ObjectOutputStream os = new ObjectOutputStream(fs);
            
            os.writeObject(BTC);
            os.writeObject(LTC);
            os.writeObject(ETH);
            
            os.close();
            
        } catch (FileNotFoundException e) { 

            e.printStackTrace();
        } catch (IOException e) { 

            e.printStackTrace();
        }
    
    }

} 