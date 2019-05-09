class SUBSTRING
{
	
	static void mysubstr(String str, int low, int high) 
{ 
    if (low<high) 
    { 
        System.out.print(str.charAt(low)); 
        mysubstr(str, low+1, high); 
    } 
} 
  
 public static void main(String[] args) {
 	
String str = "Shivam Shukla"; 
    mysubstr(str, 1, 3); 
    
 }
}