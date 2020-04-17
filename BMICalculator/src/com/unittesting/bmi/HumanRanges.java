package com.unittesting.bmi;

public enum HumanRanges {
	MAX_HEIGHT(3),
	MIN_HEIGHT(1),
	MAX_WEIGHT(500),
	MIN_WEIGHT(10);
	
	private double value;
	
	HumanRanges(double v){
		value = v;
	}
	
	public double getValue(){
		return value;
	}
	
}
