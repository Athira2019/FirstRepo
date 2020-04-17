package com.athira.methodReference;

interface Parserable{
	
	String parse(String s);
	
}

class StringParser{
	public static String convert(String str)
	{
		if(str.length()<=3)
		str=str.toUpperCase();
		else
		str=str.toLowerCase();
		return str;
	}
}

public class MyPrinter {
	
	public void printer(String str,Parserable p)
	{   str=p.parse(str);
		System.out.println(str);
		
	}
}

