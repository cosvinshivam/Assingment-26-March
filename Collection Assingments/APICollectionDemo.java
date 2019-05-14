import java.util.*;
class Laptop{
    private Integer ramSize,hddSize,id;
    private String brand;
	Laptop(int ramSize,int hddSize,String brand,int id){
    this.ramSize=ramSize;
    this.hddSize=hddSize;
    this.brand=brand;
    this.id=id;
	}

	public void setRamSize(Integer ramSize)
	{this.ramSize=ramSize;}
	public void setID(Integer id)
	{this.id=id;}
	 void setHddSize(Integer hddSize)
	{this.hddSize=hddSize;}
	public void setBrand(String brand)
	{this.brand=brand;}

	public Integer getRamSize()
	{return this.ramSize;}
	public Integer getHddSize()
	{return this.hddSize;}
	public Integer getID()
	{return this.id;}
    public String getBrand()
	{return this.brand;}
	public String toString()
	{
		return "Laptop details : \n" +"ID:"+this.getID()+ "Brand:"+this.getBrand() +"\nRAM Size" +this.getRamSize() +"\nHDD Size" + this.getHddSize() ;
	}
}
class APICollectionDemo{
    	static ArrayList list=new ArrayList();
    	Scanner sc=new Scanner(System.in);
    	static {
     	list.add(new Laptop(12,13,"IBM",1));
	 	list.add(new Laptop(123,234,"DELL",2));
	 	list.add(new Laptop(234,987,"HP",3));
    	}
	 void addItem()
	 {

	    System.out.print("Enter ID:");	 	
	 	int id=sc.nextInt();
	 	System.out.print("Enter RAM Size:");
	 	int rs=sc.nextInt();
	 	System.out.print("Enter HDD Size:");
	 	int hs=sc.nextInt();
	 	sc.nextLine();
	 	System.out.print("Enter Brand Name:");	 	
	 	String b=sc.nextLine();

	 	list.add(new Laptop(rs,hs,b,id));
	}

    void viewItem()
    {
    	if(list.isEmpty())
    	System.out.println("Sorry List is Empty !!!!");
     else
     {
    	for (Object o : list) {
    		System.out.println(o);
    	}
    }
    }
    void updateItem()
    {
    	if(list.isEmpty())
    	System.out.println("Sorry List is Empty !!!!");
        else{
    	System.out.print("Enter Item name,Which u want to Update:");
	 	String name=sc.next();
	 	System.out.print("Enter Item ID:");
	 	int id=sc.nextInt();
	 	for (Object o : list) {
       if(((Laptop)o).getID()==id)
    	{
    	   	Laptop lp=((Laptop)o);
	 	if(name.equalsIgnoreCase("RAM"))
	 	{
	 	System.out.print("Enter RAM Size:");
	 	int rs=sc.nextInt();
	 	lp.setRamSize(rs);	
	 	}
	 	else if(name.equalsIgnoreCase("HDD"))
	 	{
	 	System.out.print("Enter HDD Size:");
	 	int hs=sc.nextInt();
        lp.setHddSize(hs);	
	 	}
	 	if(name.equalsIgnoreCase("Brand"))
	 	{
	 	System.out.print("Enter Brand Name:");	 	
	 	String b=sc.next();
        lp.setBrand(b);	
	 	}
	 }
    
    }
}}
    void removeItem()
    { 
    	if(list.isEmpty())
    	System.out.println("Sorry List is Empty !!!!");
     else
     {
    	System.out.print("Enter ID of an ITEM:");
	 	int id=sc.nextInt();
        for (Object o : list) {
    	   if(((Laptop)o).getID()==id)
    	   {
        this.list.remove(this.list.indexOf(((Laptop)o)));
        break;
           }
           else
           	System.out.println("Sorry Id does not exist");
}
     }

    }
    void search()
    { 
    	if(list.isEmpty())
    	System.out.println("Sorry List is Empty !!!!");
     else
     {
    	System.out.print("Enter ID to search an  ITEM:");
	 	int id=sc.nextInt();
	 	int flag=0;
        for (Object o : list) {
    	   if(((Laptop)o).getID()==id)
    	   { flag=1;
    	   	System.out.println(" Id exist,further details are:");
            // this.viewItem();
            System.out.println(o.toString());
        break;
           }

    }
    if(flag==0)
    	System.out.println("Sorry ID does not Exist!!!");

    }
   }
	public static void main(String[] args) {
        APICollectionDemo l=new APICollectionDemo();
        String choice="y";

        l.list.add(new Laptop(12,13,"IBM",1));
	 	l.list.add(new Laptop(123,234,"DELL",2));
	 	l.list.add(new Laptop(234,987,"HP",3));  
       do{ 

       System.out.print("!!!!!!!!!!WELCOME !!!!!!!!!!!\n\t\t1)ADD More ITEMS\n\t\t2)VIEW ITEMS\n\t\t3)UPDATE ITEMS\n\t\t4)REMOVE ITEMS\n\t\t5)SEARCH\n\t\t");
       Scanner sc1=new Scanner(System.in);
       int ch=sc1.nextInt();
        switch(ch)
        {
        	case 1:System.out.print("How many items u want to insert:");
	 	            int i=sc1.nextInt(); 
	 	            for(int j=0;j<i;j++)
	 	            {
	 	            System.out.print("Enter details of "+(j+1)+" Item:\n");
	 	             l.addItem();	
	 	            }
                    break;
        	case 2: l.viewItem();
        	        break;
        	case 3: l.updateItem();
        	        break;
        	case 4:l.removeItem();
        	        break;
        	case 5:l.search();
        	       break;
        	default:System.out.println("Wrong Choice,Better Luck Next Time !!!!!!");
        }
        System.out.print("Do u Want to USE MORE:");
        choice=sc1.next();
        }while(choice.equalsIgnoreCase("y"));
	}
}