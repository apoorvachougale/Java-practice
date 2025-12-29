package com.java.annotation.demo;

import java.lang.reflect.InvocationTargetException;

public class TestApp {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> cls = Class.forName("com.java.annotation.demo.KodApp");
		Object ref = cls.getDeclaredConstructor().newInstance();
		
	}

}
