import java.util.*;
public class MostFrequentCharacter 
{ 
    static final int nc = 256; 

     char count(String str) 
    {  
        int[] count = new int[nc]; 
        int i; 
        for (i=0; i< str.length(); i++) 
            (count[str.charAt(i)])++; 
        int f = 0, s = 0; 
        for (i = 0; i < nc; i++) 
        { 
           if (count[i] > count[f]) 
            { 
                s = f; 
                f = i; 
            } 
        else if ((count[i] > count[s]) && (count[i] != count[f])) 
                s = i; 
        } 
        //System.out.println((char)s); 
        return (char)s; 
    } 
       
    public static void main(String args[]) 
    { 
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      MostFrequentCharacter mfc=new MostFrequentCharacter();
      char res = mfc.count(str); 
            if (res != '\0')
            { 
              if(res==' ')
         System.out.println("Second most frequent char is  space" + res); 
       }
      else
         System.out.println("No second most frequent character"); 
    } 
} 