public class CheckName
{
	void validate () throws MyException
	{
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter Your First Name: ");
		String fn=sc.nextLine();
		System.out.print("Enter Your Last Name: ");
		String ln=sc.nextLine();
		if(fn.equals("")|| (ln.equals("")))
		{
         throw new MyException("This is My error Message");
		}
		else
		System.out.println("Permission Granted !!\n\t Proceed Further");
}
	   
	public static void main(String[] args)  {
     CheckName cn=new CheckName();
     try{
     cn.validate();
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