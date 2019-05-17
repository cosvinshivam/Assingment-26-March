
class SumOfFirstN{
	private int sum=0;
	
	public int calculateSum(int n)
	{
		for(int i=1;i<=n;i++)
		{
          if( (i%3)==0 || (i%5)==0)
            sum=sum+i;
        }
        return sum;
	           
    
}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter Number:");
		int num=sc.nextInt();
		SumOfFirstN sn=new SumOfFirstN();
	    System.out.println(sn.calculateSum(num)) ;  
  	}
}