package com.ranga;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class AppTest {	
   @Test
   public void test1() {
      com.ranga.HelloExample obj = new com.ranga.HelloExample();
    
		int intval = 5;
		String parameter = "Pass By";
		com.ranga.HelloExample.CustDataType data = obj.new CustDataType();
		data.str = parameter;
		data.intval = intval;
		
		System.out.println("Before method => parameter=" + parameter + " int=" + intval + " data=" + data);
		obj.runMe(parameter, intval, data);
		System.out.println("After method => parameter=" + parameter + " int=" + intval + " data=" + data);

      assertTrue(true);
   }
}