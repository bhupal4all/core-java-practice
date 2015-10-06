package com.ranga.annotaion;

public class App {

	public static void main(String args[]) {
		App app = new App();
		AppObject obj = app.new AppObject();
		int c = obj.add(10, 20);

		System.out.println("Result is " + c);
	}

	public class AppObject extends TraceLogImpl {
		@TraceLog
		public int add(int a, int b) {
			entry();
			int c = a + b;
			exit();
			return c;
		}
	}

}
