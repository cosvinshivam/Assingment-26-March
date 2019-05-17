
class Difference{
	private int sum=0,sqsum=0;
	
	public int calculateDifference (int n)
	{
		for(int i=1;i<=n;i++)
		{
          int sq=i*i;
          sqsum+=sq;
            sum=sum+i;
        }
        return sum=sqsum-(sum*sum);
	       
}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();
		Difference d=new Difference();
	    System.out.println(d.calculateDifference(num)) ;  
  	}
}