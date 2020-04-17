package com.athira.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSortMain {

	public static void main(String[] args) {
	 
		List<Person> personList=new ArrayList<>();
		personList.add(new Person("Athira", 28));
		personList.add(new Person("Sam", 22));
		
	   //Using Comparator
	    Collections.sort(personList, new Comparator<Person>() {
	        @Override
	        public int compare(Person h1, Person h2) {
	            return h1.getName().compareTo(h2.getName());
	        }
	    });
	    personList.forEach(System.out::println);
	    //Using compareTo in lamda
	    personList.sort((h1, h2) -> h1.getName().compareTo(h2.getName()));
	    
	    personList.forEach(System.out::println);
	    //Using comparing method
	    Collections.sort(
	    		personList, Comparator.comparing(Person::getName));
	    personList.forEach(System.out::println);
	    //Using comparator for int
	    Collections.sort(
	    		personList, Comparator.comparingInt(Person::getAge));
	    
	    personList.forEach(System.out::println);
	    
	   // Comparator<Person> lambdaSortByAge = (Person e1, Person e2) -> e1.getAge() - e2.getAge();
	    personList.sort(( e1, e2) -> e1.getAge() - e2.getAge());
	    personList.forEach(System.out::println);
	    
	    Practice practice=new Practice();
	    List<Integer> list=Arrays.asList(1,2,3,4,5,6);
	    for(int i=1;i<list.size();i++)
	     {
	       System.out.println(practice.fib(i));
	     }
	}

}
