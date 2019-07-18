package com.cerner.demo;

public class TriangleProperties {
	
public  int getHyponuse(int i, int j) {
	
	if(i<=0 || j<=0 )
	{
		return -1;
	}
	else
	{
		return (i*i+j*j);
	}

}
public double getHypotuneseDouble(double i,double j)
{
	
	if(i<=0 || j<=0 )
	{
		return -1;
	}
	else
	{
		return (i*i+j*j);
	}
	
}
}
