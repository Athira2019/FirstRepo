package com.cerner.demo;

public class CalculateHypotunuse {

	public static void main(String[] args) {
	
		TriangleProperties triangle=new TriangleProperties();
		int hypotunuse= triangle.getHyponuse(10,5);
		if(hypotunuse < 100)
			System.out.println("Result is wrong"); 
		else
			
			System.out.println("Result is correct"); 

			 
		System.out.println("The hypotunuese is:"+hypotunuse);
		double hypoDouble=triangle.getHypotuneseDouble(2.2, 1.1);
		System.out.println("The hypotunuese is:"+hypoDouble);
		Math.abs(6.05-(hypoDouble));
		System.out.println("The delta is:"+Math.abs(6.05-(hypoDouble)));

	}

	

}
