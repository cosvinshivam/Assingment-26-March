public class Fibonacci
{
	 static int n1=1;
 static int n2=1;
 static int n3=0;
	void getFibonacci(int n)
	{
		int f=1,s=1,t;

		System.out.print(f+"\t"+s+"\t");
		for(int i=2;i<n;i++)
		{
			t=f+s;
			f=s;s=t;
		System.out.print(t+"\t");
		}
	    
	}
static void MyFibonacci(int count){
   if(count>0){
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.print(" "+n3);
        MyFibonacci(count-1);
    }
}

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		Fibonacci f=new Fibonacci();
		System.out.println("Fibonacci withput recursion:");
		f.getFibonacci(n);
        System.out.println("\nFibonacci with recursion:");
         System.out.print(n1+" "+n2);
         MyFibonacci(n-2);
         	}
}