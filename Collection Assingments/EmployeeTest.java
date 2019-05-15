import java.util.*;
class EmployeeTest{
Scanner sc=new Scanner(System.in);
List list=new ArrayList();;

	 void addItem()
	 {

	    System.out.print("Enter Employee Details:\n");	 	
	    System.out.print("ID:");	 	
	 	int id=sc.nextInt();
	 	sc.nextLine();
	 	System.out.print("Name :");
	 	String name=sc.nextLine();
	 	System.out.print("Age:");
	 	int age=sc.nextInt();
	 	sc.nextLine();
	 	System.out.print("Address:");	 	
	 	String address=sc.nextLine();
	 	list.add(new Employee(id,name,address,age));
	}
    
    void sortID()
    {
    	Collections.sort(list,new SortID());
    	System.out.println("Sorted List is:\n"+list);

    }
    void sortAge()
    {
    	Collections.sort(list,new SortAge());
    	System.out.println("Sorted List is:\n"+list);

    }
    void sortAddress()
    {
    	Collections.sort(list,new SortAddress());
    	System.out.println("Sorted List is:\n"+list);

    }
    void sortLname()
    {
    	Collections.sort(list,new SortLName());
    	System.out.println("Sorted List is:\n"+list);

    }
    void sortFname()
    {
    	Collections.sort(list,new SortFName());
    	System.out.println("Sorted List is:\n"+list);

    }

    
	public static void main(String[] args) {
	
		Scanner sc1=new Scanner(System.in);
		String choice="y",choice2=" ";
        EmployeeTest et=new EmployeeTest();
        do{
        	et.addItem();
        	System.out.print("ADD MORE (Y/N):");
        	choice=sc1.next();
        }while(choice.equalsIgnoreCase("Y"));
        do{
        System.out.print("Sort By:\n\1. ID\n2. Age\n3. Address\n4. First Name\n5. Last Name:\n");
        int ch=sc1.nextInt();
        switch(ch)
        {
        	case 1:et.sortID();
        	       break;
        	case 2:et.sortAge();
        	       break;
        	case 3:et.sortAddress();
        	       break;
        	case 4:et.sortFname();
        	       break;
        	case 5:et.sortLname();
        	       break;
        	default:System.out.println("Better Luck Next time !!!!!!!");
        }

			System.out.print("WANNA DO MORE STUFF(Y/N):");
        	choice2=sc1.next();
	}while(choice2.equalsIgnoreCase("Y"));
}
}
class Employee {
private String name,address,fname,lname;;
private Integer id,age,in;
private String rev,str1=" ",str2=" ";
Employee(Integer id,String name,String address,Integer age)
{
	this.id=id;
	this.name=name;
	this.age=age;
	this.address=address;
}
public void setfname(String fname)
{this.fname=fname;}
public String getName()
{return this.name;}
public String getLname()
{  if(this.name.indexOf(' ')!=-1)
   return this.name.substring(this.name.indexOf(' ')+1);
   else
	return " ";
}
public String getFname()
{  
	fname=this.name.split(" ")[0];  
	return this.fname;
}
public String getAddress()
{return this.address;}
public Integer getAge()
{return this.age;}
public Integer getID()
{return this.id;}
@Override
public String toString()
{
return "Employee Details:\nID:"+this.getID()+" NAME:"+this.getName()+" ADDRESS:"+this.getAddress()+"Age:"+this.getAge();
}

}

class SortAge implements Comparator{
	@Override
	public int compare(Object ref,Object sc)
	{  return ((Employee)ref).getAge().compareTo(((Employee)sc).getAge()); }
}


class SortAddress implements Comparator{
	@Override
	public int compare(Object ref,Object sc)
	{  return ((Employee)ref).getAddress().compareTo(((Employee)sc).getAddress()); }
}

class SortID implements Comparator{
	@Override
	public int compare(Object ref,Object sc)
	{  return ((Employee)ref).getID().compareTo(((Employee)sc).getID()); }
}


class SortFName implements Comparator{

	@Override
	public int compare(Object ref,Object sc)
	{  
		
		return ((Employee)ref).getFname().compareTo(((Employee)sc).getFname()); 
	}
}

class SortLName implements Comparator{

	@Override
	public int compare(Object ref,Object sc)
	{  
		
		return ((Employee)ref).getLname().compareTo(((Employee)sc).getLname()); }
}




