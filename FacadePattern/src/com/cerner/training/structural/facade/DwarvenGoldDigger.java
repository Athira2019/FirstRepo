
package com.cerner.training.structural.facade;

/**
 * 
 * DwarvenGoldDigger is one of the goldmine subsystems.
 *
 */
public class DwarvenGoldDigger extends DwarvenMineWorker {

	@Override
	public void work() {
		System.out.println("{} digs for gold." + name());
	}

	@Override
	public String name() {
		return "Dwarf gold digger";
	}
}
