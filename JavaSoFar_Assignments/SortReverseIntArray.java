import java.util.Arrays;
import java.util.Scanner;

class SortReverseIntArray	{
	public static void main(String... args)	{
		boolean errorOccured = false;
		Scanner scan = new Scanner(System.in);

		do {
			try	{
				System.out.print("Enter the integer values to sort (with spaces): ");
				String divideThisToInt = scan.nextLine();

				String[] strArr;
				strArr = divideThisToInt.split(" ");

				Integer[] intArr = new Integer[strArr.length];
				Integer[] reversedArr = new Integer[strArr.length];

				for(int i=0; i<strArr.length; ++i)	intArr[i] = Integer.parseInt(strArr[i]);

				for(int i=0; i<intArr.length; ++i)	reversedArr[i] = SortReverseIntArray.reverseNum(intArr[i]);
				Arrays.sort(reversedArr);

				System.out.println("Reversed sorted array: ");
				for(Integer i: reversedArr)	System.out.println(i);

				errorOccured = false;
			}
			catch(NumberFormatException nfe)	{
				System.out.println(nfe);
				errorOccured = true;
			}
		}
		while(errorOccured == true);

	}

	public static Integer reverseNum(Integer num)	{
		int returnIt=0;
		while(num !=0)	{
			returnIt += num%10;
			returnIt *= 10;
			num /= 10;
		}
		return returnIt/10;
	}
}