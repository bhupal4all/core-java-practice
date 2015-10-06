package com.ranga.annotaion;

import java.lang.reflect.Method;
import java.util.Date;

public abstract class TraceLogImpl {
	public void entry() {
		Class<? extends TraceLogImpl> currentClass = getClass();
		Method methods[] = currentClass.getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(TraceLog.class)) {
				TraceLog log = method.getAnnotation(TraceLog.class);
				System.out.println(new Date() + " " + log.entryPrefix()
						+ method.getName());
			}
		}
	}

	public void exit() {
		Class<? extends TraceLogImpl> currentClass = getClass();
		Method methods[] = currentClass.getDeclaredMethods();

		for (Method method : methods) {
			if (method.isAnnotationPresent(TraceLog.class)) {
				TraceLog log = method.getAnnotation(TraceLog.class);
				System.out.println(new Date() + " " + log.exitPrefix()
						+ method.getName());
			}
		}
	}
}
