package com.ibm.wallet.service;

import java.util.Random;
import java.util.Scanner;

import com.ibm.wallet.bean.Wallet;
import com.ibm.wallet.dao.WalletDaoClass;

public class WalletServiceClass implements WalletServiceInterface{
Scanner sc;
WalletDaoClass wd;

public WalletServiceClass() {
sc=new Scanner(System.in);
wd=new WalletDaoClass();
}
	@Override
	public void dbcon() {
		
	}
	@Override
	public int open_Acc(Wallet w) {
		return wd.open_Acc(w);
		
	}

	@Override
	public void withdraw(Wallet w) {

		wd.withdraw(w);
		wd.show_balance(w);
	}

	@Override
	public void fund_Transfer(Wallet w,long bal,long receiver) {

    	wd.fund_Transfer(w,bal,receiver);
    	wd.show_balance(w);
	}

	@Override
	public void deposit(Wallet w){
		wd.deposit(w);
		wd.show_balance(w);
		
	}

	@Override
	public void print_Transctions(Wallet w,String ch) {
		//System.out.println(ch);
		wd.print_Transctions(w,ch);
		
	}

	@Override
	public boolean lowbalance(Wallet w) {
		return wd.lowbalance(w);
		
	}

	@Override
	public boolean checkBalance(Wallet w) {
		return wd.checkBalance(w);
		
	}
	@Override
	public boolean isExist(Wallet w) {
		
		return wd.isExist(w);
	}
	public void acc_detail(Wallet w) {
		
		wd.acc_detail(w);
		wd.show_balance(w);
		
	}
	public boolean isValCon(Wallet w) {
	  
		if(w.getContact().length()==10)
		return true;
		else
			return false;
	}
	public boolean isValAmt(String str) {
		  int flag=0;
		try {
			long l=Long.parseLong(str);
			flag=1;
		}
		catch (Exception e) {
			flag=0;
		}
		  if(flag==1)
		return true;
		else
			return false;
	}
	public void show_balance(Wallet w)
	{
		wd.show_balance(w);
	}
	public boolean isInitial(String str) {
		if(Long.parseLong(str)>3000)
		return true;
		else
			return false;
	}


}


	
	

