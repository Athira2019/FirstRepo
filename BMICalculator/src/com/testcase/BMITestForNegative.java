package com.testcase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.unittesting.bmi.BMICalcMain;
import com.unittesting.bmi.BMICalculationException;
import com.unittesting.bmi.BMICalculator;
import com.unittesting.bmi.BMIDiagnosticResultLoader;
import com.unittesting.bmi.BMIOutOfBoundsException;

public class BMITestForNegative {

	BMICalculator bmiTest;
	BMIDiagnosticResultLoader resultLoader;
	@Before
	public void setUp() throws Exception {
		
		bmiTest=new BMICalcMain();
		resultLoader = new BMIDiagnosticResultLoader();
	}
	
	
	@Test(expected=BMICalculationException.class)
	public void CheckForwrongHeightInput(){
		
		bmiTest.calculateBMI(-1, 45);
		
	}
	
	@Test(expected=BMIOutOfBoundsException.class)
	public void CheckForOutOfBoundBMIUpper(){
	
		bmiTest.getBMIDiagnosticResults(120, resultLoader);
		
	}
	@Test(expected=BMIOutOfBoundsException.class)
	public void CheckForOutOfBoundBMILower(){
		
		bmiTest.getBMIDiagnosticResults(.001, resultLoader);
		
	}
	
	
	@Test(expected=BMICalculationException.class)
	public void CheckForWrongHeightWeight(){
	
		bmiTest.calculateBMI(-1, -45);
		
	}

	
	@Test(expected=BMICalculationException.class)
	public void CheckForBMiWrong(){
		
		Assert.assertTrue(bmiTest.calculateBMI(0.00, 45) > 0);
	}
	
	@Test(expected=BMICalculationException.class)
	public void CheckBMiForWrongWeight(){
		
		Assert.assertTrue(bmiTest.calculateBMI(1, 0.0) > 0);
	}
	
	@Test(expected=NullPointerException.class)
	public void CheckForNPE(){
		resultLoader=null;
		bmiTest.getBMIDiagnosticResults(90, resultLoader);
	}
	
	
	@After
	public void tearDown() throws Exception {
	}

}
