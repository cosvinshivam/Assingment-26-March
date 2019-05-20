package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.DaoClass;

public class EmployeeServiceClass  implements ServiceInterface{
    Employee th;
	DaoClass dao;
	
	public EmployeeServiceClass() {
		//th=new Employee();
		dao=new DaoClass();
	}
	
	public  void getPolicy(Employee th) {
		//th=dao.displayEmployee().get(id);
	//System.out.println(dao.displayEmployee());
		//System.out.println(th.getSalary());
		if((th.getSalary()>5000 && th.getSalary()<20000) && th.getDesignation().equalsIgnoreCase("System Associate"))
	     th.setInsur_scheme("Scheme C");
		else if((th.getSalary()>=20000 && th.getSalary()<40000) && th.getDesignation().equalsIgnoreCase("Programmer"))
		     th.setInsur_scheme("Scheme B");
		else if((th.getSalary()>=40000) && th.getDesignation().equalsIgnoreCase("Manager"))
		     th.setInsur_scheme("Scheme A");
		else
			if((th.getSalary()<5000) && th.getDesignation().equalsIgnoreCase("Clerk"))
			     th.setInsur_scheme("No Scheme");
	}
	
	public void storeIntoMap(Employee emp){
		dao.storeIntoMap(emp);
		
	}
	public Map<Integer, Employee> displayEmployee() {
		
		return dao.displayEmployee();
	}
	public boolean validateid(int id){
   return dao.validateid(id);
	}
	
	
}
