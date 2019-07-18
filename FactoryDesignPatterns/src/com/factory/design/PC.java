/**
 * 
 */
package com.factory.design;

/**
 * @author AS045216
 *
 */
public class PC implements Computer{
	
	private String Ram;
	private String CPU;
	
	

	public PC(String ram, String cPU) {
		super();
		Ram = ram;
		CPU = cPU;
	}

	@Override
	public String getRam() {
		return this.Ram;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}

}
