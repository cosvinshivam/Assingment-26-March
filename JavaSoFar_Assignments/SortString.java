
class SortString{
		
	String  sortString(String st)
	{
		String str[]=st.split(" ");
		String rev=" ";
       if(str.length%2 == 0)	{
       	for(int i=0;i<=str.length/2;i++){
      		str[i]=str[i].toUpperCase();
}
	   }
		else 	
		{
	      	for(int i=0;i<(str.length/2)+1;i++)
			str[i]=str[i].toUpperCase();
		}
		for(String s:str)
		{rev=rev+s+" ";
		}
	     return rev;         
		}
	
    
public static String sortWord(String word)	{
		Character[] charArray = new Character[word.length()];
		String returnThis =" ";

		for(int i=0; i<word.length(); ++i)	charArray[i] = word.charAt(i);

		java.util.Arrays.sort(charArray);

		for(Character c: charArray)	returnThis += c.toString();

		return returnThis;
	}
	public static void main(String[] args) {
		SortString ss=new SortString();
 		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter string:");
	    String str=sc.nextLine();

		//System.out.println(sortWord(str));
         String rev=" ";
       for(String sortThis: str.split(" "))	{
			rev=rev+ss.sortWord(sortThis);
		}

      System.out.println(ss.sortString(rev)+"\n");	
  
	}
}