/**
 * Factory class which creates new pC or server 
 * Advantages:
 * Absrtaction,easy to extend,loosely coupled
 * JDK ex:createCaleder(),getInstance()
 */
package com.factory.design.impl;

import com.factory.design.Computer;
import com.factory.design.PC;
import com.factory.design.Server;

/**
 * @author AS045216
 *
 */
public class ComputerFactory {

	public static Computer createComputer(ComputerType type, String ram, String cpu)

	{
		Computer comp = null;
		switch (type) {
		case PC:
			comp = new PC(ram, cpu);
			break;
		case Server:
			comp = new Server(ram, cpu);

			break;
		}

		return comp;

	}

}
