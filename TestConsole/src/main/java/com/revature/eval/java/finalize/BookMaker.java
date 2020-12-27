/**
 * 
 */
package com.revature.eval.java.finalize;

/**
 * @author thomasm1
 *
 */
 
public class BookMaker {
	
	String name;
	int pages;
	
	public BookMaker(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + "]";
	}
	
	/*
	 * This method is a method that is called when an
	 * object is GC. Marked for deletion. Its memory
	 * can be used for another purpose.
	 * NEVER use finalize. It is BAD practice.
	 */
	@Override
	public void finalize() {
		System.out.println("This book is about to be destroyed: " + this.name);
	}

}
