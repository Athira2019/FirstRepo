package com.factory.design.impl;

import com.factory.design.Computer;

public class ComputerFactAbstarct {

	public static Computer createcomputer(AbstractComputerFactory caf)
	{
		return caf.createComputer();
	}
}
