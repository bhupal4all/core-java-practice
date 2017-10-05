package com.ranga.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		App app = new App();

		try {
			Method method = App.TestClass.class.getMethod("print",
					String.class, Integer.class);

			TestClass obj = app.new TestClass();
			method.invoke(obj, "Ranga", new Integer(30));
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	public class TestClass {
		public void print(String name, Integer age) {
			System.out
					.println("Test Class printing... " + name + " age " + age);
		}
	}

}
