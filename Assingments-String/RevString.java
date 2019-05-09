import java.util.*;
 
class RevString
{

   void check(){
      String original, reverse = ""; // Objects of String class
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a string :");
      original = sc.nextLine();
     
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
    
         System.out.println("The Reverse of a String is "+reverse);
   }
   public static void main(String args[])
   {
     RevString ch=new RevString();
     ch.check();
         
   }
}  
