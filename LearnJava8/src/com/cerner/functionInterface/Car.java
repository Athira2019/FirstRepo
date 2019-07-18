package com.cerner.functionInterface;

public interface Car {
	
	default  String ride(){
		System.out.println("car");
		return "Inside Car --Ride";
		
	}

}
