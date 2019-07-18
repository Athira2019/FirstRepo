package com.cerner.functionInterface;

import java.util.Arrays;
import java.util.List;

public class RunnerClass {

	public static void main(String[] args) {
		 Maruti marutiObj=new Maruti();
		 marutiObj.ride();
		 
		 //Demo for foreach
		 
		 List<Integer>  arr=Arrays.asList(4,5,7,8,9);
		 //conventional for loop
		 for(int i=0;i<arr.size();i++)
		 {
			 System.out.println(arr.get(i));
		 }
		 //enhanced for loop
		 for(int i:arr)
		 {
			 System.out.println(i);
		 }
         //for each loop
		  arr.forEach(i -> System.out.println(i));
	}

}
