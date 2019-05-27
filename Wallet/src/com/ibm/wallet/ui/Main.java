package com.ibm.wallet.ui;

import java.util.Random;
import java.util.Scanner;
import com.ibm.wallet.bean.Wallet;
import com.ibm.wallet.dao.WalletDaoClass;
import com.ibm.wallet.service.WalletServiceClass;

public class Main {
public static void main(String[] args) {
	WalletServiceClass ws=new WalletServiceClass();
	Wallet w=new Wallet();
	Scanner sc=new Scanner(System.in);
	String c="y";
	do {
		System.out.println("\n\n\t\t\tWELCOME In IBM'S WALLET\n\n");
	System.out.println("\tEnter ur choice:\n\t1)Open Acc\n\t2)Withdraw\n\t3)Deposit\n\t4)Fund Transfer\n\t5)Transactions\n\t6)Check Balance\n\t");
	int ch=sc.nextInt();
	sc.nextLine();
if(ch==1)
{
	System.out.println("----------WELCOME-----------");
	System.out.print("Enter account holder name:");
	String n=sc.nextLine();
	w.setName(n);
	System.out.print("Enter account holder address:");
    w.setAddress(sc.nextLine());
    while(true){
    	System.out.print("Enter account holder contact:");
        w.setContact(sc.next());
        sc.nextLine();
		boolean isValid= ws.isValCon(w);
		
		if(isValid)
			break;
		else
			System.out.println("Please Provide Valid contact of 10 digit.......");
			
		}
    while(true){
    	System.out.print("Enter initial balance:");
        w.setBalance(sc.nextLong());
        //sc.nextLine();
		boolean isValid;
		if(w.getBalance()<3000)
			isValid=false;
		
		else
			isValid=true;
		
		if(isValid)
			break;
		else
			System.out.println("you must have to maintain minimum balance of 3000rs to avail the services.......");
		
			
		}
   
    
    long timeSeed = System.nanoTime(); 
    while(true){
        double randSeed = Math.random() * 1000; 

        long midSeed = (long) (timeSeed * randSeed); 

        String s = midSeed + "";
        String subStr = s.substring(0, 9);

        int finalSeed = Integer.parseInt(subStr);
        w.setAcct_no(finalSeed);
		boolean isValid= ws.isExist(w);
		if(isValid)
			continue;
		else
			break;
		}
    
	sc.nextLine();
	if(ws.open_Acc(w)>0)
		{System.out.println("Account opened Successfully!!!");
	   ws.acc_detail(w);
	   System.out.println("Thanks for Banking With US .........:-)");
		}
	else
		System.out.println("Server Down....Pls try after some time........");
}
if(ch==2)
{
    while(true){
    	System.out.print("Enter accountNo:");
    	String acn=sc.nextLine();
		boolean isValid=false;
		if(ws.isValAmt(acn))
		{
		w.setAcct_no(Long.parseLong(acn));
		if(ws.isExist(w)) 
			isValid=true;
		else
			isValid=false;
		}

		if(isValid)
			break;
		else
			System.out.println("Account number Does Not Exist.Please enter it again.......");
			
		}
    while(true){
        System.out.print("Enter amt to withdraw:");
        String str=sc.nextLine();
        boolean isValid=ws.isValAmt(str);
           	
		if(isValid)
		{
			w.setBalance(Long.parseLong(str));

			break;
		}
		else
		{
			System.out.println("Please Provide Valid Amount.......\\n");
			
		}
   
    }

 
    
    
    System.out.println("----------------");
	if(ws.checkBalance(w))
	{ 
		if(ws.lowbalance(w))
		{		 
		    System.out.println("Low Balance......!!1\n If u want to Proceed Press 1 or 2 to abort the transaction: ");
		    if(sc.nextInt()==1)
		    {
		    	ws.withdraw(w);
		    	System.out.println("Thanks for Banking With US .........:-)");
		    }
		    else
		    {
		    System.out.println("Thanks for Banking With US .........:-)");
		    System.exit(0);
		    }
		}
		else
		{ ws.withdraw(w);
		  System.out.println("Thanks for Banking With US .........:-)");
		}

	}
	else
	System.out.println("You have Unsufficient Balance to Transfer....");
	
	
}
else if (ch==3)
{
    while(true){
    	System.out.print("Enter accountNo:");
    	String acn=sc.nextLine();
		boolean isValid=false;
		if(ws.isValAmt(acn))
		{
		w.setAcct_no(Long.parseLong(acn));
		if(ws.isExist(w)) 
			isValid=true;
		else
			isValid=false;
		}
		if(isValid)
			break;
		else
			System.out.println("Account number Does Not Exist.Please enter it again.......");
			
		}

    while(true){
        System.out.print("Enter amt to deposit:");
        String str=sc.nextLine();
		boolean isValid= ws.isValAmt(str);
		
		if(isValid)
		{
			w.setBalance(Long.parseLong(str));
			break;
		}
		else
			System.out.println("Please Provide Valid Amount.......\n");
			
		}

	ws.deposit(w);
	System.out.println("Thanks for Banking With US .........:-)");
	
}
else if(ch==4)
{
    while(true){
    	System.out.print("Enter accountNo:");
    	String acn=sc.nextLine();
		boolean isValid=false;
		if(ws.isValAmt(acn))
		{
		w.setAcct_no(Long.parseLong(acn));
		if(ws.isExist(w)) 
			isValid=true;
		else
			isValid=false;
		}
		if(isValid)
			break;
		else
			System.out.println("Account number Does Not Exist.Please enter it again.......");
			
		}
    long t_acct=0L;
        while(true){
        	System.out.print("Enter accountNo where u want to transfer ur fund:");
        	String acn=sc.nextLine();
    		boolean isValid=false;
    		if(ws.isValAmt(acn))
    		{
    			t_acct=Long.parseLong(acn);
    		w.setAcct_no(t_acct);
    		if(ws.isExist(w)) 
    			isValid=true;
    		else
    			isValid=false;
    		}

    		if(isValid)
    			break;
    		else
    			System.out.println("Account number Does Not Exist.Please enter it again.......");
    			
    		}

    
	long bal;

    while(true){
    	System.out.print("Enter amount to be transfered:");
    	 String str=sc.nextLine();
		boolean isValid= ws.isValAmt(str);
		
		if(isValid)
		{
			bal=Long.parseLong(str);
			break;
		}
		else
			System.out.println("\nPlease Provide Valid Amount.......\n");
			
		}
    //System.out.println("check cxchsk");
	w.setBalance(bal);
	//sc.nextLine();
	if(ws.checkBalance(w))
	{
		if(ws.lowbalance(w))
		{
	
		    System.out.println("Low Balance......!!1\n If u want to Proceed Press 1 or 2 to abort the transaction: ");
		    if(sc.nextInt()==1)
        	{sc.nextLine();
		    	ws.fund_Transfer(w,bal,t_acct);
        	System.out.println("Thanks for Banking With US .........:-)");
        	}
		    else
		    {
		    System.out.println("Thanks for Banking With US .........:-)");
		    System.exit(0);
		    }
		}
		else
		{
			ws.fund_Transfer(w,bal,t_acct);
		}
	}
	else
	{
	System.out.println("You have Unsufficient Balance to Transfer....");
	}

}
else if(ch==5)
{
    while(true){
    	System.out.print("Enter accountNo:");
    	String acn=sc.nextLine();
		boolean isValid=false;
		if(ws.isValAmt(acn))
		{
		w.setAcct_no(Long.parseLong(acn));
		if(ws.isExist(w)) 
			isValid=true;
		else
			isValid=false;
		}

		if(isValid)
			break;
		else
			System.out.println("Account number Does Not Exist.Please enter it again.......");
			
		}
	  System.out.print("\tSelect the type of transaction:\n\t1)Credited\n\t2)Debited\n\t3)Fund Transfer\n\t");
	  int c1=sc.nextInt();
	  sc.nextLine();
	  if(c1==1)
	    ws.print_Transctions(w,"Credited");
	  if(c1==2)
		    ws.print_Transctions(w,"Debited");
	  if(c1==3)
		    ws.print_Transctions(w,"Fund Transfer");
}
else if(ch==6)
{
	  while(true){
	    	System.out.print("Enter accountNo:");
	        w.setAcct_no(sc.nextLong());
	        sc.nextLine();
			boolean isValid= ws.isExist(w);
			
			if(isValid)
				break;
			else
				System.out.println("Account number Does Not Exist.Please enter it again.......\n");
				
			}
	  ws.show_balance(w);
}
System.out.print("\n\t\tDo You Want More Banking With us(Y/N):");
c=sc.next();
	}while(c.equalsIgnoreCase("y"));
}

}
