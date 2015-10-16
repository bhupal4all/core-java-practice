package com.ranga;

public class HelloExample{
	public static void main(String[] args) {
		HelloExample obj = new HelloExample();
		
		int intval = 5;
		String parameter = "Pass By";
		CustDataType data = obj.new CustDataType();
		data.str = parameter;
		data.intval = intval;
		
		obj.runMe(parameter, intval, data);
		
		System.out.println("After method => parameter=" + parameter + " int=" + intval + " data=" + data);
	}
	
	/*
	* prmitive data type will be passed by value
	* custom classes would be passed by reference
	*/
	private void runMe(String parameter, int val, CustDataType data){
		parameter = parameter + " changed ";
		val = val * 10;
		
		data.str = parameter;
		data.intval = val;
		
		System.out.println("Inside method -> parameter=" + parameter + " int =" + val + " data=" + data);
	}	
	
	public class CustDataType{
		public String str = null;
		public Integer intval = null;
		
		public String toString()
		{
			return "CustDataType [ str = " + str + ", intval = " + intval + "]";
		}
	}
}