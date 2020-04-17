package com.java.lambda;

import java.util.NoSuchElementException;

public class MinInteger {

	public static void main(String[] args) {
		int[] array= {};
		MinIntAlgorithm minIntAlgorithm=new MinIntAlgorithm();
		int result= minIntAlgorithm.minIntAlgorithm(array);
		System.out.println(result);
		 
		int result1= minIntAlgorithm.getMin(array);
		System.out.println(result1);
	}
    
	
	
}
