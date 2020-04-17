package com.java.lambda;

import java.util.Arrays;

public class ArrayRange {
	
	
	    public int[] searchRange(int[] nums, int target) {
	        int[] range= {-1,-1};
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]== target)
	            { 
	            	range[0]=i;
	            	break;
	            }
	        }
	        
	        
			return range;
	        
	    
	}

}
