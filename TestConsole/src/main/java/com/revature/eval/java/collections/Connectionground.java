package com.revature.eval.java.collections;

public class Connectionground {
	public static void main(String[] args) {
			// This is not allowed bc constructor is *private*
	  	    //Connection conn = new Connection("Connection1", 15);
	
		Connection conn1 = Connection.getConnection("Connection1", 41);
	    System.out.println(conn1);
				
		// All one static object (2nd object is impossible) bc Singleton).
		
		Connection conn2 = Connection.getConnection("Connection2", 42);
		 System.out.println(conn2);
			
				System.out.println(conn1 == conn2);
				conn1.id = 100;
				
				System.out.println(conn1 == conn2);
				
		System.out.println(conn1.id);
		System.out.println(conn2.id);
	}
}
