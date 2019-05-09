class AddInputArgs
{
public static void main(String...args) {
	int sum=0;

	   if(args.length==1)
			{
				System.out.println("Acess Denied ! ,Input must be greater than 1");
				
			}
			else
			{
		for(int i=0;i<args.length;i++)
		{

			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("Sum is "+sum);
	}
	}	
}