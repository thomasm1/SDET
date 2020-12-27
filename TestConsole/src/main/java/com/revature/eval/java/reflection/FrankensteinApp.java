package com.revature.eval.java.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FrankensteinApp {
	Method bark;
	Method meow;

	Field f;

	// The Class class
	Class clss;

	public FrankensteinApp() {
		try {
			this.bark = Dog.class.getMethod("bark", null);
			this.meow = Cat.class.getMethod("meow", null);
			try {
				this.f = Dog.class.getField("breed");
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		FrankensteinApp catdog = new FrankensteinApp();
		try {
			catdog.bark.invoke(null, null);
			catdog.meow.invoke(null, null);
			System.out.println(catdog.f.getName());
			System.out.println(catdog.f);
	 	} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] methods = String.class.getMethods();
//		for(Method m: methods) {
//			System.out.println(m.toGenericString());  // lists all methods available as a string class
//		}
	}
}
