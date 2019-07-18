package com.java.lambda;

import java.util.NoSuchElementException;

public class MinIntAlgorithm {
	public int minIntAlgorithm(int[] arr)
	{
		int min=arr[0];
		int min2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]< min)
			{   min2=min;
				min=arr[i];
			}else if(arr[i]<min2)
			{
				min2=arr[i];
			}
		}
		
		return min2;
		
	}
	
	public int[] flip1(int[] arr,int k)
	{
		int[] temp=new int[arr.length];
		
		for(int i=arr.length,j=0;i== 0;i--)
		{
			temp[j]=arr[i];
			j++;
		}
		
		 for(int i=0;i==k;i++)
		 {
			System.out.println(temp[i]+"--"); 
		 }
		return temp;
		
	}
	
	public void flip(int[] arr,int k)
	{
		int temp;
	   if(arr.length<2|| arr==null)
		   return;
	   for(int i=0;i<=k/2;i++)
	   {
		   temp=arr[i];
		   arr[i]=arr[k-i-1];
		   arr[k-i-1]=temp;
		   
	   }
		
	}
	
	
	 public  int getMin(int[] inputArray){ 
		  if(inputArray.length<1 || inputArray==null)
		       throw new NoSuchElementException("Empty Array");
	    int minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 
	  } 
}
