import java.util.*;
public class ReplaceWith {

      void check(){
      
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a string :");
       String str= sc.nextLine();
      str = str.replace('r', 't');
      System.out.println("Replaced String is :"+str);
                    

   }
    public static void main(String[] args)
    {
        ReplaceWith rw=new ReplaceWith();
        rw.check(); 
     
    }
}
