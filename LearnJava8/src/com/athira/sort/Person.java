package com.athira.sort;

import java.util.Comparator;

public class Person {

	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/*public class PersonComparator implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			if(o1.getAge()-o2.getAge() >1)
			return 1;
			else 
			return 0;
		}
		
	}*/
}
