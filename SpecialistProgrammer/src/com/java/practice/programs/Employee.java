package com.java.practice.programs;

public class Employee {

	private int emp_id;
	private String name;
	private String dept;
	private int salary;
	public Employee() {

	}
	public Employee(int emp_id, String name, String dept, int salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[emp_id=" + emp_id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
