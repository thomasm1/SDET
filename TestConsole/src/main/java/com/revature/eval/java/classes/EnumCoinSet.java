package com.revature.eval.java.classes;



public enum EnumCoinSet {
    BTC("Bitcoin"), ETH("Ethereum"), LTC("Litecoin");
    
    private String symbol;
    
    EnumCoinSet(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
    
    public String toString() {
        return "This coin is called: " + symbol;
    }
}

 