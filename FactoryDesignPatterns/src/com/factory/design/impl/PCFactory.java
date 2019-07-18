/**
 * 
 */
package com.factory.design.impl;

import com.factory.design.Computer;
import com.factory.design.PC;

/**
 * @author AS045216
 *
 */
public class PCFactory implements AbstractComputerFactory {

	private String ram;
	private String CPU;

	public PCFactory(String ram, String cpu) {
		this.ram=ram;
		this.CPU=CPU;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	/* (non-Javadoc)
	 * @see com.factory.design.impl.AbstractComputerFactory#createComputer()
	 */
	@Override
	public Computer createComputer() {
		return new PC(this.ram,this.CPU);
	}

}
