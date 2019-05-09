import java.util.*;
public class FirstNonRepeated {
          void check(){
      
      Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter a string :");
       String s= sc.nextLine();
   for (int i = 0; i < s.length(); i++) {
             boolean unique = true;
             for (int j = 0; j < s.length(); j++) {
                 if (i != j && s.charAt(i) == s.charAt(j)) {
                     unique = false;
                     break;
                 }
              }
             if (unique) {
                 System.out.println("First non repeated character is  \""
                 + s + "\" is:" + s.charAt(i));
                 break;
             }
         }
                    

   }
     public static void main(String...args) {
        FirstNonRepeated fnr=new FirstNonRepeated();
        fnr.check();
     
     }
}