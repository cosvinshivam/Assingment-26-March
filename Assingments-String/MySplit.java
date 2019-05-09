import java.util.*;
public class MySplit {

 static String[] mySplit(String text,String delemeter){
    java.util.List<String> parts = new java.util.ArrayList<String>();
    text+=delemeter;        
    for (int i = text.indexOf(delemeter), j=0; i != -1;) {
        parts.add(text.substring(j,i));
        j=i+delemeter.length();
        i = text.indexOf(delemeter,j);
    }


    return parts.toArray(new String[0]);
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter String :");
        String str = sc.nextLine();
        System.out.print("Enter delimeter :");
    String delemeter=sc.nextLine();
    String result[]=mySplit(str,delemeter);
    for(String s:result)
        System.out.println(s);
}

}