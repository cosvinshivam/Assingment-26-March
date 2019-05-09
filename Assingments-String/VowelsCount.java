import java.util.*;
class VowelsCount
{
	String var;
	int a=0,e=0,i=0,o=0,u=0;
	void count()
	{
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter String :");
     String str = sc.nextLine();
     for(int j=0;j<str.length();j++)
     {
     	switch(str.charAt(j))
     	{
     		case 'A':
     		case 'a':a++;
     		       break;
     	  	case 'E':
     		case 'e':e++;
     		       break;
     		case 'I':
     		case 'i':i++;
     		       break;
     		case 'O':
     		case 'o':o++;
     		       break;
     		case 'U':
     		case 'u':u++;
     		       break;
     	    
     	}
     }
     System.out.println("Number of Vowels"+(a+e+i+o+u));
     System.out.print("Occurence of A:"+a+"\nOccurence of E:"+e+"\nOccurence of I:"+i+"\nOccurence of O:"+o+"\nOccurence of U:"+u);
	}
	public static void main(String[] args) {
		VowelsCount vc=new VowelsCount();
		vc.count();
	}
}