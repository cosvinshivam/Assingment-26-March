import java.util.*;
public class RemoveDuplicates {

    
      
public String remove(String input){
    String result = "";
    for (int i = 0; i < input.length(); i++) {
        if(!result.contains(String.valueOf(input.charAt(i)))) {
            result += String.valueOf(input.charAt(i));
        }
    }
    return result;
}
      
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string :");
       String str= sc.nextLine();
        RemoveDuplicates rd=new RemoveDuplicates();
        System.out.println(rd.remove(str)); 
     
    }
}



