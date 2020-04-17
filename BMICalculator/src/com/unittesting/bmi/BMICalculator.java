package com.unittesting.bmi;

public interface BMICalculator {
	

	
	/**
	 * This method will validate that the height and weight are within normal
	 * human ranges and calculate the BMI using the height and weight in 
	 * metric units (meters and kilograms).
	 * 
	 * 
	 * @param height in meters
	 * @param weight in kilograms
	 * @return double of calculated BMI
	 */
	public double calculateBMI(double height, double weight) throws BMICalculationException;
	
	/**
	 * This method will return the appropriate diagnostic message based upon a BMI and
	 * the passed BMIDiagnosticResultLoader.  BMIRange will need to be determined from 
	 * the BMI to use the BMIDiagnosticResultLoader 
	 * 
	 * @param bmi
	 * @return BMI diagnostic message
	 */
	public String getBMIDiagnosticResults(double bmi, BMIDiagnosticResultLoader rl) throws BMIOutOfBoundsException;
	
	
}
