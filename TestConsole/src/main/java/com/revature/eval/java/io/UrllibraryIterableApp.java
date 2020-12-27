package com.revature.eval.java.io;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;


public class UrllibraryIterableApp implements Iterable<String> {
	
    private LinkedList<String> urls = new LinkedList<String>();

    private class UrlIterator implements Iterator<String> { 
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() { 
            StringBuilder sb = new StringBuilder();
            
            try {
                URL url = new URL(urls.get(index)); 
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); 
                String line = null;
                
                while( (line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("n");
                }
                
                br.close();
                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            index++;
            
            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        } 
    }
    
    public UrllibraryIterableApp() {
        urls.add("https://www.facebook.com/thomasm1.maestas");
        urls.add("https://github.com/thomasm1");
        urls.add("http://localhost:4000");
    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    /*
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
    */
    
    
}
