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

public class BMITestCasePositive{

	
	BMICalculator bmiTest;
	BMIDiagnosticResultLoader resultLoader;
	@Before
	public void setUp() throws Exception {
		
		bmiTest=new BMICalcMain();
		resultLoader = new BMIDiagnosticResultLoader();
	}
	
	@Test
	public void CheckForBMIObese(){
		
		Assert.assertEquals(45.0, bmiTest.calculateBMI(1, 45),0.001);
		
	}
	
	
	@Test
	public void CheckForBMINormal(){
		
		Assert.assertTrue(bmiTest.calculateBMI(1.5, 45) > 0);
	}
	
	
	@Test
	public void CheckForWeightBelowMax(){
		
		Assert.assertTrue(bmiTest.calculateBMI(1, 499) > 0);
		
	} 
	
	
	@Test
	public void CheckForResultLoader(){
	
         Assert.assertNotEquals("", bmiTest.getBMIDiagnosticResults(90, resultLoader));
         Assert.assertEquals("Obese, please consult your doctor", bmiTest.getBMIDiagnosticResults(90, resultLoader));
         	}
	
	
	@After
	public void tearDown() throws Exception {
	}

}
