package com.unittesting.bmi;

import java.util.Scanner;

public class BMICalcMain implements BMICalculator {

	public static void main(String[] args) {

		BMICalcMain calcMain = new BMICalcMain();
		Scanner in = new Scanner(System.in);
		System.out.println("please enter the height(in meter)");
		double ht = in.nextDouble();
		System.out.println("please enter the weight(in Kilograms)");
		double wt = in.nextDouble();
		double bmiRes = 0.0;
		try {
			bmiRes = calcMain.calculateBMI(ht, wt);
			System.out.println("Calculated BMI" + bmiRes);
			BMIDiagnosticResultLoader rl = new BMIDiagnosticResultLoader();
			
		    String text = calcMain.getBMIDiagnosticResults(bmiRes, rl);
			System.out.println("BMI range " + text);
		} catch (BMICalculationException be) {
			System.out.println(be.getMessage());
			System.exit(-1);
		} catch (BMIOutOfBoundsException bo) {
			System.out.println(bo.getMessage());
		}

	}

	@Override
	public double calculateBMI(double height, double weight) throws BMICalculationException {
		double bmi = 0.0;
		if (height < HumanRanges.MIN_HEIGHT.getValue() || height > HumanRanges.MAX_HEIGHT.getValue()
				|| weight < HumanRanges.MIN_WEIGHT.getValue() || weight > HumanRanges.MAX_WEIGHT.getValue()) {
			throw new BMICalculationException("Height or weight  is not in range");
		} else {

			bmi = weight / (height * height);
		}
       
		return bmi;
	}

	@Override
	public String getBMIDiagnosticResults(double bmi, BMIDiagnosticResultLoader rl) throws BMIOutOfBoundsException {

		String result = "";
		
		
		if(rl==null)
		{
			
			throw new NullPointerException("Object entered is null");
		}
		
		else
		{
		
		if (bmi >= .01 && bmi <= 18.5) {
			result = rl.getResultsText(BMIRange.UNDERWEIGHT);

		} else if (bmi > 18.5 &&  bmi <= 25) {
			result = rl.getResultsText(BMIRange.NORMAL);

		}

		else if (bmi > 25 && bmi <= 30) {
			result = rl.getResultsText(BMIRange.OVERWEIGHT);
		} else if (bmi > 30 && bmi <= 100) {
			result = rl.getResultsText(BMIRange.OBESE);
		} else {
			throw new BMIOutOfBoundsException("BMI is not within the valid range");
		}
		
		}
       
		return result;
	}

}
