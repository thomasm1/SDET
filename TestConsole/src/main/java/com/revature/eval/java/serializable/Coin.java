package com.revature.eval.java.serializable;
import java.io.Serializable;

public class Coin implements Serializable {
    
    private static final long serialVersionUID = 4801633306273802062L; 
    private int id;
    private String name;
    private String symbol;
    
    public Coin(int id, String symbol) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Coin [id=" + id + ", name=" + name + ", symbol=" + symbol + "]";
    }
}
