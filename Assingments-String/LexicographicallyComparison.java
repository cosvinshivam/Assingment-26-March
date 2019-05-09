import java.util.*;
public class LexicographicallyComparison {

void compare()
{
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a first string :");
      String str1= sc.nextLine();
      System.out.print("Enter a second string :");
      String str2= sc.nextLine();
     int result = str1.compareToIgnoreCase(str2);

        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }  
}
public static void main(String[] args)
    {
       LexicographicallyComparison lc=new LexicographicallyComparison();
       lc.compare();
       
    }
}

