package com.ranga;

import org.apache.log4j.Logger;

public class HelloExample{
	
	final static Logger logger = Logger.getLogger(HelloExample.class);
	
	public static void main(String[] args) {
	
		HelloExample obj = new HelloExample();
		obj.runMe("ranga");
		
	}
	
	private void runMe(String parameter){
		logger.trace("Entering...");
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}

		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		logger.warn("This is warn : " + parameter);
		
		try{
			int i = 100/0;
		}catch(Exception ex){
			logger.error("This is error : " + parameter, ex);
		}
		
		logger.fatal("This is fatal : " + parameter);
		
		logger.trace("Exiting...");
	}
	
}