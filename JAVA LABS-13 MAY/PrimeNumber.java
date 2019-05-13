public class PrimeNumber
{
	void getPrime()
	{
		int n,p;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		System.out.print("PRIME NUMBERS ARE:\n");
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.print(i+"\t");
		}

}
	   
	public static void main(String[] args) {
		PrimeNumber pn=new PrimeNumber();
		pn.getPrime();
	}
}
