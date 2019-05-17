
class JobSeeker{
	String user_name;
	boolean validate()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Username:");
		String user_name=sc.nextLine();
	    if(user_name.endsWith("_job") && user_name.length()>=8)
            return true;
        else
        	return false;
	              
    }
	public static void main(String[] args) {
		JobSeeker js=new JobSeeker();
		if(js.validate())
			System.out.println("VALID USERNAME !");
		else
			System.out.println("NOT A VALID USERNAME !");
  
	}
}