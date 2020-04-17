package com.athira.functionInterface;

public interface Car {
	
	default  String ride(){
		System.out.println("car");
		return "Inside Car --Ride";
		
	}

}
