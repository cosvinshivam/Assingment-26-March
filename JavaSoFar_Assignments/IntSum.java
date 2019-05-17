class IntSum{
	int sum;
	int sum()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		java.util.StringTokenizer stoken = new java.util.StringTokenizer(str, " ");
        while (stoken.hasMoreTokens()) {
             
            sum = sum + Integer.parseInt(stoken.nextToken());
            
        }
        return sum;
    }
	public static void main(String[] args) {
		IntSum is=new IntSum();
		System.out.println(is.sum());
	}
}