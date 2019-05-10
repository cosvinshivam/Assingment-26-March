
class AddFloatInputArgs
{
public static void main(String...args) {
	float sum=0;
	float sd=0;
	int in;
	

	   if(args.length==1)
			{
				System.out.println("Acess Denied ! ,Input must be greater than 1");
				
			}
			else
			{
		for(int i=0;i<args.length;i++)
		{
          float  f=Float.parseFloat(args[i]);

          //System.out.println(f);
            in = (int) f;
           
           //System.out.println(f);
			sum+=in;
			sd+=(f-in);
		}
          float a=sum+sd;
		// System.out.println("Sum is "+sum);
		// System.out.println("SD:"+Math.abs(sd));
		// System.out.println("Sum is "+ sum );
		System.out.printf("Sum is %.2f ",a);
	}
	}	
}