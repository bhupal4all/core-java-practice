package com.ranga.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class JavaReflectionTest {
	@Before
	public void before()
	{
		System.out.println("--------------------------------------------------");
	}
	@After
	public void after()
	{
		System.out.println("--------------------------------------------------");
	}
	
	@Test
	public void invokeTest() {
		App app = new App();
		Object result = null;
		
		try {
			Method method = App.TestClass.class.getMethod("print",
					String.class, Integer.class);

			App.TestClass obj = app.new TestClass();
			result = method.invoke(obj, "Ranga", new Integer(30));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		assertTrue(true);
	}
}
