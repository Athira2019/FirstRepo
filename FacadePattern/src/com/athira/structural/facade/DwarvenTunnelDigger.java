
package com.athira.structural.facade;

/**
 * 
 * DwarvenTunnelDigger is one of the goldmine subsystems.
 *
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker {

	@Override
	public void work() {
		System.out.println("{} creates another promising tunnel." + name());
	}

	@Override
	public String name() {
		return "Dwarven tunnel digger";
	}
}
