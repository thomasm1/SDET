package com.revature.eval.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListFactory {
	public static List<Integer> getList(int choice) {
		if(choice == 1) {
			System.out.println("Created ArrayList");
			return new ArrayList<Integer>();
		}
		if(choice == 2) {
			System.out.println("Created LinkedList");
			return new LinkedList<Integer>();
		}
		return null;
	}
}
