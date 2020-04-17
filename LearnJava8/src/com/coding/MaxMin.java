package com.coding;

import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
	MaxMin min=new MaxMin();

	}
	 static void miniMaxSum(int[] arr) {
	     int min=0;
	     int max=0;
	     int[] sum;
	     int sumTotal=0;
	     for(int i=0;i<arr.length;i++)
	     {
	      sumTotal=(arr[i]*arr[i-1])/arr.length;
	      for (int j:arr)
	      {
	         // sum.add(sumTotal-arr[j]);
	      }
	      /*sum.sort();
	      min=sum[0];
	      max=sum[arr.length];*/
	     }

	    }
	 
	 static int maximumToys(int[] prices, int k) {
	        int sum=0;
	        int count=0;
	        if(prices.length==0 || k==0)
	         return sum;
	        for(int p:prices)
	        {
	            if(p==k)
	            {
	                count=1;
	            }
	            if(p<k && sum<k)
	            {
	                sum+=p;
	                if(sum<=k)
	                {
	                count++;
	                }
	            }
	        }
	       return count;

	    }

	  static long countInversions(int[] arr) {
	        int inv_count = 0; 
	        for (int i = 0; i < arr.length - 1; i++) 
	            for (int j = i + 1; j < arr.length ; j++) 
	                if (arr[i] > arr[j]) 
	                    inv_count++; 
	  
	        return inv_count; 
	  }
	  
	  public static int diagonalDifference(List<List<Integer>> arr) {
		    int firstdiagSum=0;
		    int secondDiagSum=0;
		    
		    for(int i=0;i<arr.size();i++)
		    {
		        for(int j=0;j<arr.size();j++)
		        {   if(i==j)
		            firstdiagSum+=arr.get(i).get(j);
		        }
		    }
		     for(int i=arr.size();i>0;i--)
		    {
		        for(int j=arr.size();j>0;j--)
		        {   if(i==j)
		            secondDiagSum+=arr.get(i).get(j);
		        }
		    }
		    return Math.abs(secondDiagSum-firstdiagSum);

		    }

		
}
