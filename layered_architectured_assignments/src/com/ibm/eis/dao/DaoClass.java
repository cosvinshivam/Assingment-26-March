package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employee;




public class DaoClass implements Daointerface {

	
	private Map<Integer,Employee> emp=new 
			HashMap<Integer,Employee>();
	public void storeIntoMap(Employee emps){
		
		emp.put(emps.getId(), emps);
		
	}
	
	public boolean validateid(int id){
		if(emp.containsKey(id))
			return true;
		else
			return false;
	}
	public DaoClass()
	  {  
	emp.put(1,new Employee(1,30000,"Shivam","Programmer"));
	 }
	 
	public Map<Integer,Employee>displayEmployee(){
		return emp;
	}
	

	
	
	
	
}
