package com.revature.eval.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) {
		try {
			write();
			read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
		public static void write() throws IOException {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("../JavaBay5/src/main/resources/io.txt"));
			bw.write("stuff");
			
			bw.close();
		}

		public static void read() throws IOException {
			BufferedReader br = new BufferedReader(new FileReader("../JavaBay5/src/main/resources/io.txt"));
			
			String line;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}		
			
			br.close();
		}
}
