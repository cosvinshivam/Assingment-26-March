		
import java.io.*;
class ChecksOnFile{

void read()
{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter the file name:");
	String fname=sc.nextLine();
	File f=new File(fname);
	if(f.exists())
	System.out.println("File Exists");
    else
    System.out.println("File Exists");
    
    if(f.canRead())
    System.out.println("File is Readable");
    else
    System.out.println("File is not Readable");	
    if(f.canWrite())
    System.out.println("File is Writable");
    else
    System.out.println("File is not Writable");	
  System.out.println("Length of file:"+f.length());

System.out.println("TYPE OF FILE IS :"+fname.substring(fname.indexOf('.')+1));
}
	public static void main(String[] args) {
		ChecksOnFile ch=new ChecksOnFile();
		ch.read();
	

	} 
}