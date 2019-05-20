package com.ibm.eis.dao;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface Daointerface {
	void storeIntoMap(Employee emp);
    boolean validateid(int id);
	Map<Integer,Employee> displayEmployee();
	
}
