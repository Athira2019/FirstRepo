package com.unittesting.bmi;

public class BMICalculationException extends RuntimeException {

	/**
	 * Stub class for communicating to API consumers that the height and or weight is not
	 * within valid ranges for BMI calculation.
	 */
	private static final long serialVersionUID = -4180019919636352679L;
	
	public BMICalculationException(String string) {
		super(string);
	}
}
