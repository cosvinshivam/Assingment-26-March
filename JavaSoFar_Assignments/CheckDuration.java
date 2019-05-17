
class CheckDuration{
	String date;
	void check()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the DATE (YYYY/MM/DD):");
		String date=sc.nextLine();
		String []d=date.split("/");
		int yr=Integer.parseInt(d[0]);
		int mm=Integer.parseInt(d[1]);
		int dt=Integer.parseInt(d[2]);
        
		java.time.LocalDate today = java.time.LocalDate.now();
        java.time.LocalDate  tocheck = java.time.LocalDate.of(yr, mm,dt);

     java.time.Period p = java.time.Period.between(tocheck, today);
      
System.out.println("YEAR DURATION:" + p.getYears() + " \nMONTHS DURATION: "+ p.getMonths() + "\nDAYS DURATION:" + p.getDays());
  
    }
	public static void main(String[] args) {
		CheckDuration cd=new CheckDuration();
		cd.check();
		// System.out.println(is.sum());
	}
}