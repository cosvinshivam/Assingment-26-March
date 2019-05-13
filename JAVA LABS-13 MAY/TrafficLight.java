public class TrafficLight
{
	void choice()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("Enter your choice:\n\t1)RED\n\t2)YEllow\n\t3)Green\n\t");
	    int ch=sc.nextInt();
	    switch(ch)
	    {
	    	case 1:System.out.println("Stop");
	    	       break;
	    	case 2:System.out.println("Ready");
	    	       break;	    	
	    	case 3:System.out.println("Go !!!!");	   
	     	       break;
	    	default:System.out.println("Better Luck Next Time");
	    }
	}
	public static void main(String[] args) {
		TrafficLight tl=new TrafficLight();
		tl.choice();
	}
}