		
import java.io.*;
class ReadFileWithLineNumber{
	public static void main(String[] args) {
	File f=new File("Myfile.txt");
		try{
FileReader fr=new FileReader(f);
StringBuilder sb = new StringBuilder("");
BufferedReader br = new BufferedReader(new FileReader(f));
String str = "";
int c=0;
while((str = br.readLine()) != null)
{
	c++;
    System.out.println("LINE NUMBER:"+c+"\t"+str);
}
br.close();
// System.out.println("Contents from file are : " + sb);
  }	
       		
		catch(IOException e)
		{
			System.out.println(e);
		}
	} }