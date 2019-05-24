package com.ibm.wallet.dao;

import com.ibm.wallet.bean.Wallet;

public interface WalletDaoInterface {
	void dbcon();
	int open_Acc( Wallet w);

    boolean checkBalance(Wallet w);
    boolean isExist(Wallet w);
	boolean lowbalance(Wallet w);
	void show_balance(Wallet w);
	void withdraw(Wallet w);
	void deposit(Wallet w);
	void fund_Transfer(Wallet w, long sender, long receiver);
	void print_Transctions(Wallet w, String ch);
}
