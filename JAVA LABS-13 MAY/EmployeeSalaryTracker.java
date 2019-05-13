import com.cg.eis.exception.*;
public class EmployeeSalaryTracker
{
	void validateAge () throws EmployeeException
	{
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter Your Salary: ");
		int salary=sc.nextInt();
		if(salary<3000)
		{
         throw new EmployeeException("This is My error Message");
		}
		else
		System.out.println("Permission Granted !!\n\t Proceed Further");
}
	   
	public static void main(String[] args)  {
     EmployeeSalaryTracker cn=new EmployeeSalaryTracker();
     try{
     cn.validateAge();
        }
        catch(EmployeeException e)
        {
        	System.out.println(e);
        }

	}
}
