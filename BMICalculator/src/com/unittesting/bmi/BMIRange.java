package com.unittesting.bmi;

/**
 * Enum of value ranges for diagnostic status using BMI
 * The min and max values define the ranges of BMI that will return 
 * a specific BMIRange.  The formula for range is
 * min < BMI <= max
 * 
 *
 */
public enum BMIRange {
	UNDERWEIGHT("underweight",.01d,18.5d),
	NORMAL("normal",18.5d,25d),
	OVERWEIGHT("overweight",25d,30d),
	OBESE("obese",30d,100d);
	
	private final double min;
	private final double max;
	private final String key;
	/**
	 * Instantiation for enum
	 * @param key
	 * @param min
	 * @param max
	 */
	BMIRange(String key, double min, double max){
		this.key = key;
		this.min = min;
		this.max = max;
	}
	
	/**
	 * Minimum value for a given range
	 * @return
	 */
	public double getMin(){
		return min;
	}
	/**
	 * Maximum range for a given value
	 * @return
	 */
	public double getMax(){
		return max;
	}
	/**
	 * Key phrase used to describe the range.  It is for internal mapping and 
	 * not for display to user.  
	 * @return
	 */
	public String key(){
		return key;
	}
}
