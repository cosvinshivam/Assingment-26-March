import java.util.*;
public class EndingWith {

      void check(){
      
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a string :");
       String str= sc.nextLine();
      System.out.print("Enter a String to check :"); 
      String n=sc.next();   
      if(str.endsWith(n))
      System.out.println("It Ends with entered String");        
    else
      System.out.println("Not Ends");
                    

   }
    public static void main(String[] args)
    {
        EndingWith ew=new EndingWith();
        ew.check(); 
     
    }
}