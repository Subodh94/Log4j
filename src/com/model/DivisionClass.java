package com.model;

import org.apache.log4j.Logger;


public class DivisionClass 
{
	static Logger logger= Logger.getLogger(DivisionClass.class);
	
	public int division(int a,int b)
	{
		int c=a/b;
		logger.info("Information message");
		return c;		
		
	}

}