/**
 * 
 */
package com.factory.design.impl;

import com.factory.design.Computer;

/**
 * @author AS045216
 *
 */
public class ComputerClient {
	public static void main(String[] args) {
		Computer comp= ComputerFactory.createComputer(ComputerType.PC, "12GB", "Cpu1");
		Computer comp1=ComputerFactory.createComputer(ComputerType.Server, "16GB", "CPU2");
		
	}
	
	

}
