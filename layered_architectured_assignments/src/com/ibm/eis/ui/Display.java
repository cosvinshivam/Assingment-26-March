package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeServiceClass;

public class Display {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		  EmployeeServiceClass  esc=new EmployeeServiceClass();
		  Employee e=new Employee();
		  String cho="y";
		do {
		  System.out.print("Enter your Choice\n\t:1)Enter Employee Details\n\t2)Get Policy"
				+ "\n\t3)Display Details of an Employee\n\t");
		int ch=sc.nextInt(); 

	  if(ch==1)
	  {
		  int id;
		  while(true){
			System.out.print("Enter ID:");
				 id=sc.nextInt();
				boolean isValid= esc.validateid(id);
				if(isValid)
					System.out.print("ID Already Exists,Please Provide Again:\n");
				else
					break;
				}
			
		  e.setId(id);
		  sc.nextLine();
		  System.out.print("Enter Name:");
		  e.setName(sc.nextLine());
		  System.out.print("Enter Designation:(System Associate,Programmer,Manager)");
		  e.setDesignation(sc.nextLine());
		  System.out.print("Enter Salary:");
		  e.setSalary(sc.nextInt());
		  sc.nextLine();
		  esc.getPolicy(e);
		  esc.storeIntoMap(e);

	  }
	  	if(ch==2)
		{
         System.out.print("Enter emp ID:");
	     int id=sc.nextInt();
		  
		Employee e1=esc.displayEmployee().get(id);
		System.out.println(e1.getInsur_scheme());
		}
	  	if(ch==3)
	  	{
           System.out.println( esc.displayEmployee());
	  	}
		  System.out.print("USE MORE (Y/N):");
	    cho=sc.next(); 
		}while(cho.equalsIgnoreCase("y"));

	}

}
