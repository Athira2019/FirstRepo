package com.cerner.methodReference;

public class RunnerClass {

	public static void main(String[] args) {
		{
			MyPrinter printer= new MyPrinter();
			String str="Athira";
			printer.printer(str, StringParser::convert);
		}

	}

}
