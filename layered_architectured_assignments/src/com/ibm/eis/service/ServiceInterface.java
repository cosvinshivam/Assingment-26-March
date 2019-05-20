package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;
public interface ServiceInterface {
	void storeIntoMap(Employee emp);
    void getPolicy(Employee th);
    boolean validateid(int id);
	//public abstract
    Map<Integer,Employee>  displayEmployee();

}
