import java.io.*;
class CopyDataThread implements Runnable{

private File file_source,file_target;
CopyDataThread(File file_source,File file_target)
{
	this.file_source=file_source;
	this.file_target=file_target;
}
	@Override
	public void run(){
          try {
			FileReader fr = new FileReader(file_source);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(file_target, true);
			int s;
			int c=0;
 			while ((s = br.read()) != -1) { 
				
                c++;
                if(c==10)
                {
                 System.out.println("10 characters are copied");
                 Thread.sleep(5000);
                 c=0;
                }
				fw.write((char)s); 
				fw.flush();
			}
			br.close();
			fw.close();
          System.out.println("file copied ");
		} catch (IOException e ) {
			e.printStackTrace();
		}
		catch (InterruptedException ie ) {
			ie.printStackTrace();
		}

	}


}
class FileProgram{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Source file name:");
		String s=sc.nextLine();
		System.out.println("Enter Target file name:");
		String t=sc.nextLine();
        File fs=new File(s);
        File ft=new File(t);
		CopyDataThread cd=new CopyDataThread(fs,ft);
		Thread th=new Thread(cd);
		th.start();
	}
}