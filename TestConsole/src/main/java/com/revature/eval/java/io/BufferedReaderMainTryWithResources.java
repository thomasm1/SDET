package com.revature.eval.java.io;
class Temp implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("inevitable errors !!");
    }
}

public class BufferedReaderMainTryWithResources {
    public static void main(String[] args) {
        
        try(Temp temp = new Temp()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}