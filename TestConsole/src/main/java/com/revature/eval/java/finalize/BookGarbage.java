package com.revature.eval.java.finalize;

public class BookGarbage {

	public static void main(String[] args) {
		
		BookMaker dracula = new BookMaker("Dracula", 563);
		BookMaker dracula2 = new BookMaker("Dracula", 563);
		BookMaker dracula3 = new BookMaker("Dracula", 563);
		
		dracula = null;
		System.gc();
		
		BookMaker hobbit = new BookMaker("The Hobbit", 350);
		
		hobbit = null;
		
		//It will REQUEST that garbage collection be run.
		System.gc();
		
		BookMaker it = new BookMaker("It", 1000);
		BookMaker it2 = it;
		BookMaker it3 = it2;
		
		it.pages = 1001;
		it = null;
		
		System.gc();
		System.out.println(it);
		System.out.println(it2);
		System.out.println(it3);
		
		
		
		
		System.exit(0);
		
	}
}
