package com.ibm.eis.bean;

public class Employee {
	 private int id,salary;
	 String name,designation,insur_scheme;
	 public Employee(int id,int salary,String name,String designation) {
		 this.name=name;
		 this.designation=designation;
		 this.id=id;
		 this.salary=salary;
	}
	public Employee()
	 {
		 
	 }
	public String toString() {
		return "Employee [Id="+id +" Salary="+salary+" Name=" +
	name + " Designation=" +this.getDesignation() + " Insurance_Scheme="+ insur_scheme+" ]";
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsur_scheme() {
		return insur_scheme;
	}
	public void setInsur_scheme(String insur_scheme) {
		this.insur_scheme = insur_scheme;
	}
	@Override
	public int hashCode()
	{ 
		return this.id;
		
	}
	@Override
	 public boolean equals(Object o)
	 {
	   return ((Employee)o).id==this.id;
	}
}
