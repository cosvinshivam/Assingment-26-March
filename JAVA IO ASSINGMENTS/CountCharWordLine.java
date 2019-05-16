import java.io.*;
class CountCharWordLine{
void count()
{
	File f=new File("Myfile.txt");
		try{
FileReader fr=new FileReader(f);
char[] in=new char[1000];
int size=fr.read(in);
int count =0;
BufferedReader br = new BufferedReader(new FileReader(f));
String str = "",str2=" ";
int c=0;
String line=br.readLine();
        while(line!=null)
        {
            String[] words=line.split(" ");
            c = c + words.length;
            count++;
            line=br.readLine();
        }
  
br.close();
System.out.println("Number of Characters:"+size);
System.out.println("Number of Line:"+count);
System.out.println("Number of Words:"+c);
  }	
     catch(IOException e)
		{
			System.out.println(e);
		}
}

	public static void main(String[] args) {
	
	CountCharWordLine ch=new CountCharWordLine();
	ch.count();
	} 
}


     	
        