package com.java.annotation.demo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, IllegalAccessException {
		Class<?> cls = Class.forName("com.java.annotation.demo.Student");
		Object obj = cls.getDeclaredConstructor().newInstance();
		Method m = cls.getDeclaredMethod("stdDetails");
		m.setAccessible(true);
		m.invoke(obj);
	
	}
}
