package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee1 {
	private String name;

	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

	public void show() {
		System.out.print("Inside show");
	}
}
