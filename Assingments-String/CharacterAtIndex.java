import java.util.*;
class CharacterAtIndex
{
	String str;
	int n;
	   void check(){
      
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a string :");
      str = sc.nextLine();
      System.out.print("Enter a index :"); 
      n=sc.nextInt();   
      int length = str.length();
     
                
         System.out.println("The Character at "+n+"index is "+str.charAt(n-1));
   }
   public static void main(String args[])
   {
     CharacterAtIndex ci=new CharacterAtIndex();
     ci.check();
         
   }
}