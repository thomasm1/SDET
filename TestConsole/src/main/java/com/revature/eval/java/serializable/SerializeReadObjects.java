package com.revature.eval.java.serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
 
public class SerializeReadObjects {

    
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try(FileInputStream fi = new FileInputStream("coins.bin")) {
            
            ObjectInputStream os = new ObjectInputStream(fi);
            
            SerializeObjectCoin coin1 = (SerializeObjectCoin)os.readObject();
            SerializeObjectCoin coin2 = (SerializeObjectCoin)os.readObject();
            SerializeObjectCoin coin3 = (SerializeObjectCoin)os.readObject();
            
            os.close();
            
            System.out.println(coin1);
            System.out.println(coin2);
            System.out.println(coin3);
            
        } catch (FileNotFoundException e) { 

            e.printStackTrace();
        } catch (IOException e) {
            
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
        
    }

}