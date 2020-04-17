package com.athira.functionInterface;

public interface Bike {
	default String ride()
	{ 
		System.out.println("bike");
		return "Inside Bike--ride";
		
	}

}
