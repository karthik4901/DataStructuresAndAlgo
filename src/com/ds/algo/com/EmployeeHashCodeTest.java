package com.ds.algo.com;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class EmployeeHashCodeTest {
	
	public static void main(String[] args) {
		
		Set<Employee> empList = new HashSet<Employee>();
		empList.add(new Employee(1,"karthik",new Date(1992,18,8)));
		empList.add(new Employee(1,"karthik",new Date(1992,18,8)));
		empList.add(new Employee(3,"Naveen",new Date(1990,3,8)));
		
		System.out.println(empList.size());
		
		
		
	}

}
