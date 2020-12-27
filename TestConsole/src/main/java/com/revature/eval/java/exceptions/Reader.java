package com.revature.eval.java.exceptions; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {

	public static void main(String[] args) {
		
		try {
			//int i = 10/0;
			readAwfulFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void readAwfulFile() throws FileNotFoundException {
		
		File f = new File("sea:ryan/unicorn/leprechauns/sphinx");
		System.out.println(f.exists());
		
		BufferedReader reader = new BufferedReader(new FileReader(f));
	}
}
