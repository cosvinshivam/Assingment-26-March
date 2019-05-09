import java.util.*;
public class MostFrequentCharacter 
{ 
    static final int NO_OF_CHARS = 256; 

     char countSecond(String str) 
    { 
        int[] count = new int[NO_OF_CHARS]; 
        int i; 
        for (i=0; i< str.length(); i++) 
            (count[str.charAt(i)])++; 
        int first = 0, second = 0; 
        for (i = 0; i < NO_OF_CHARS; i++) 
        { 
           if (count[i] > count[first]) 
            { 
                second = first; 
                first = i; 
            } 
        else if (count[i] > count[second] && 
                     count[i] != count[first]) 
                second = i; 
        } 
       
        return (char)second; 
    } 
       
    public static void main(String args[]) 
    { 
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      MostFrequentCharacter mfc=new MostFrequentCharacter();
      char res = mfc.countSecond(str); 
      if (res != '\0') 
         System.out.println("Second most frequent char is " + res); 
      else
         System.out.println("No second most frequent character"); 
    } 
} 