import java.util.*;
 
class CheckPalindrome
{

   void check(){
      String original, reverse = ""; // Objects of String class
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a string to check if it is a palindrome:");
      original = sc.nextLine();
     
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         System.out.println("The string is a palindrome.");
      else
         System.out.println("The string is not a palindrome.");
   }
   public static void main(String args[])
   {
     CheckPalindrome ch=new CheckPalindrome();
     ch.check();
         
   }
}  
