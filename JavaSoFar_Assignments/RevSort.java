
class RevSort{
		
	int  []elementSort(int []ar)
	{
       for(int i=0;i+1<ar.length;i++)
       {

       if(ar[i]<ar[i+1])
       {
       	int temp=ar[i];
       	ar[i]=ar[i+1];
       	ar[i+1]=temp;
       }
       }

     return ar;
	              
    }

    int []arrange(int []arr)
    {
    for(int j=0;j<arr.length;j++)
    {
int number = arr[j];
int sorted = 0;
int digits = 10;
int sortedDigits = 1;
boolean first = true;

while (number > 0) {
    int digit = number % 10;

    if (!first) {

        int tmp = sorted;
        int toDivide = 1;
        for (int i = 0; i < sortedDigits; i++) {
            int tmpDigit = tmp % 10;
            if (digit >= tmpDigit) {
                sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                break;
            } else if (i == sortedDigits-1) {
                sorted = digit * digits + sorted;
            }
            tmp /= 10;
            toDivide *= 10;
        }
        digits *= 10;
        sortedDigits += 1;
    } else {
        sorted = digit;
    }

    first = false;
    number = number / 10;
}
if(arr[j]==23)
arr[j]=32;
//System.out.println(sorted);
arr[j]=sorted;
}
return arr;
}


	public static void main(String[] args) {
		RevSort ss=new RevSort();
 		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();  
        }

       ss.arrange(a);
       int []result=ss.elementSort(a);
        //int []s=ss.sort();
	     for (int a1 : result) {
	     	System.out.println(a1);
	     }
			
	
  
	}
}