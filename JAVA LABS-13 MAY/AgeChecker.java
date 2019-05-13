public class AgeChecker
{
	void validateAge () throws MyException
	{
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter Your Age: ");
		int age=sc.nextInt();
		
		if(age<15)
		{
         throw new MyException("This is My error Message");
		}
		else
		System.out.println("Permission Granted !!\n\t Proceed Further");
}
	   
	public static void main(String[] args)  {
     AgeChecker cn=new AgeChecker();
     try{
     cn.validateAge();
        }
        catch(MyException e)
        {
        	System.out.println(e);
        }

	}
}
class MyException extends Exception{
   MyException(String str2) {
	super(str2);
   }
 
}