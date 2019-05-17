
class CubicSumOfDigits{
	private int num,rem,sum=0;
	
	void cubeSum()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter Number:");
		num=sc.nextInt();
		while(num>0)
	    {
	    	rem=num%10;
	    	sum+=rem*rem*rem;
	    	num=num/10;
	    }
        System.out.println("\nSum of Digits Cube is "+sum);
	              
    }
	public static void main(String[] args) {
		CubicSumOfDigits cs=new CubicSumOfDigits();
	
	    cs.cubeSum();
			
	
  
	}
}