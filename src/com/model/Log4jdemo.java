package com.model;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Log4jdemo {
	
	static Logger logger=Logger.getLogger(Log4jdemo.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Information message");
		logger.debug("Debug message");
		logger.warn("Warn message");
		logger.error("Error message");
		logger.fatal("Fatal message");
		
		DivisionClass dc= new DivisionClass();
		
		try
		{
			int num1=90;
			int num2=0;
			dc.division(num1, num2);
		}catch (ArithmeticException e)
		{
			int num1=90;
			int num2=2;
			dc.division(num1, num2);
			logger.fatal("Catch block is executed successfully");
			
		}
		
		
		
		
		
	}

}
