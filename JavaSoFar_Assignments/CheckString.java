class CheckString{

	boolean check()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		int flag=1;
		for(int i=0;i+1<str.length();i++)
		{   
			if(str.charAt(i)==' ')
				continue;
            
			else if(!(str.charAt(i)<str.charAt(i+1) ))
				{
					flag=0;
					break;
			   }
     	}
     	if(flag==1)
     		return true;
     	else
     		return false;

    }
	public static void main(String[] args) {
		CheckString cs=new CheckString();
		if(cs.check())
		System.out.println("String is Positive");
	    else
		System.out.println("String is negative");
	}
}