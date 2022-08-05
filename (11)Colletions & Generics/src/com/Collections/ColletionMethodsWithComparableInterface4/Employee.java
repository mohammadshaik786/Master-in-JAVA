package com.Collections.ColletionMethodsWithComparableInterface4;

public class Employee implements Comparable<Employee> {
	String name;
	int salary;
	String dept;
	
	public Employee(String name, int salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee e) {
		if(this.salary < e.salary){
			return 1;
		}else if(this.salary > e.salary){
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
}
