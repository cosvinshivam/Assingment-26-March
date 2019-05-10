
import java.util.*;
class CheckAnagram
{

		static boolean check(String str1, String str2) {

		int anagramSize = str2.length();
		for(int i=0; i<str2.length(); ++i)	{
			for(int j=0; j<str1.length(); ++j)	{
			if(str1.charAt(j) == str2.charAt(i))	
			--anagramSize;
				if(anagramSize == 0)
					return true;
			}
		}
		return false;
	
}	
	public static void main(String[] args) {

		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
        str1=sc.nextLine();
        System.out.println("Enter the string to check:");
        str2=sc.nextLine();
		//Anagram an=new Anagram(); 
		//boolean a=an.check(str1,s2);]
		if(CheckAnagram.check(str1,str2))
		
			System.out.println("IT is an Anagram");
		else
			System.out.println("Not an Anagram");
	}
}