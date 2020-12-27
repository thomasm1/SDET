package com.revature.eval.java.collections;

public class Connection {
	String name;
	int id;
	
	private static Connection conn = null;
	// All Singletons should have a *private* construtor
	
	private Connection(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public static Connection getConnection(String name, int id) {
		if(conn == null) {
			conn = new Connection(name, id);
		}
		return conn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
