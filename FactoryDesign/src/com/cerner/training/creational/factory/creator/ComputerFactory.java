package com.cerner.training.creational.factory.creator;

import com.cerner.training.creational.factory.bean.Computer;
import com.cerner.training.creational.factory.bean.PC;
import com.cerner.training.creational.factory.bean.Server;

public class ComputerFactory {

public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {

	Computer comp = null;
	switch (type) {
	case PC:
		comp = new PC(ram, hdd, cpu);
		break;
	case SERVER:
		comp = new Server(ram, hdd, cpu);
		break;
	}

	return comp;
}
}
