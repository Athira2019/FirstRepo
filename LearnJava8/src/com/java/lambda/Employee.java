package com.java.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee {
	
		 private int id;
		 private String name;
		 private double salary;
		 
		 public Employee(int id, String name, double salary) {
		 this.id = id;
		 this.name = name;
		 this.salary = salary;
		 }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		 
		Comparator<Employee> lambdaSortByName = 
				 (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
	

  Comparator<Employee> sortByName = new Comparator<Employee>() {
	 @Override
	 public int compare(Employee e1, Employee e2) {
	 return e1.getName().compareTo(e2.getName());
	 }
  };
  

/*// Initial data
ArrayList<Employee> empList = new ArrayList<Employee>();
empList.add(new Employee(500, "Shifoo", 150000));
empList.add(new Employee(504, "Oogway", 120000));
empList.add(new Employee(503, "Tigress", 100000));
empList.add(new Employee(730, "Mantis", 45000));
 
System.out.println("Initial List :");
list.forEach(System.out::println);

collections.sort(empList, (e1,e2)-> (e1.name.compareTo(e2.name));

empList.sort((p1, p2) -> e1.name.compareTo(e2.name));*/
 
/*//sortByName already defined in above snippet
Collections.sort(list, sortByName);
System.out.println("\nStandard Sorted by Name :");
list.forEach(System.out::println);
 
//lambdaSortByName already defined in above snippet
list.sort(lambdaSortByName);
System.out.println("\nLambda Sorted by Name :");
list.forEach(System.out::println);
 
Comparator<Employee> lambdaSortById = (Employee e1, Employee e2) -> e1.getId() - e2.getId();
list.sort(lambdaSortById);
 
System.out.println("\nSorted by Id :");
list.forEach(System.out::println);*/
}

