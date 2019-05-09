import java.util.*;
 
class InitialsPrint
{
  String str;
   void check(){
    
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a string:");
      str = sc.nextLine();
     
      for(int i=0;i<str.length();i++)
     {
        if(str.charAt(i)==' ')
          System.out.print(str.charAt(i+1)+" ");
        if(i==0)
         System.out.print(str.charAt(i)+" ");
      }
  }
   public static void main(String args[])
   {

     InitialsPrint ip=new InitialsPrint();  
     ip.check();  
   }
}  
