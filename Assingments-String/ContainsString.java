
 import java.util.*;
class ContainsString { 
  
      void check(){
      
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a string :");
       String str= sc.nextLine();
      System.out.print("Enter a Character to check :"); 
      String n=sc.next();   
      if(str.contains(n))
      System.out.println("It Contains");      	
    else
      System.out.println("Not Contains");
     
                

   }
    public static void main(String args[]) 
    { 
        ContainsString cs=new ContainsString();
        cs.check(); 
    } 
}