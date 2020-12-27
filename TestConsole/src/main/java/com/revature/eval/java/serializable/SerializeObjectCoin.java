package com.revature.eval.java.serializable;
/* 
Serialization turns objects into binary form, to save them to a file. 
Serialization implements save and load functionality.
*/
import java.io.Serializable;

public class SerializeObjectCoin implements Serializable {
    
    private static final long serialVersionUID = 4801633306273802062L; 
    private int id;
    private String name;
    private String symbol;
    
    public SerializeObjectCoin(int id, String name, String symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Coin [id=" + id + ", name=" + name + ", symbol=" + symbol + "]";
    }
}

 