package com.ibm.wallet.service;

import com.ibm.wallet.bean.Wallet;

public interface WalletServiceInterface {
	
	
	void dbcon();
	int open_Acc(Wallet w);
	boolean lowbalance(Wallet w);
	boolean checkBalance(Wallet w);
	void withdraw(Wallet w);
	void deposit(Wallet w);
	boolean isExist(Wallet w);
	
	void fund_Transfer(Wallet w, long bal, long receiver);
	void print_Transctions(Wallet w, String ch);
    

}
