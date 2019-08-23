package com.parent;

public class Employee implements Comparable<Employee> {

	
	private double salary;
	

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}





	@Override
	public int compareTo(Employee o) {
		return Double.valueOf(this.salary).compareTo(o.getSalary());
	}
	
}
