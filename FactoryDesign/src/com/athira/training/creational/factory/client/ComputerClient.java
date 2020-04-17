package com.cerner.training.creational.factory.client;

import com.cerner.training.creational.factory.bean.Computer;
import com.cerner.training.creational.factory.creator.ComputerFactory;
import com.cerner.training.creational.factory.creator.ComputerType;

public class ComputerClient {

	public static void main(String[] args) {

		Computer pc =  ComputerFactory.createComputer(ComputerType.PC, "1GB", "256GB", "Intel Core 2 Duo");

		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "32GB", "1TB", "AMD Ryzen 7 2700X");
	}

}
