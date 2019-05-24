package com.ibm.wallet.bean;

public class Wallet {

	private String name,address,contact;
	private long acct_no,tacct_no;
    private long balance;
	public Wallet(String name, String address, long acct_no, String contact, long balance,long tacct_no) {
		this.name = name;
		this.address = address;
		this.acct_no = acct_no;
		this.contact = contact;
		this.balance = balance;
		this.tacct_no=tacct_no;
	}

	public long getTacct_no() {
		return tacct_no;
	}

	public void setTacct_no(long tacct_no) {
		this.tacct_no = tacct_no;
	}

	public Wallet() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAcct_no() {
		return acct_no;
	}
	public void setAcct_no(long acct_no) {
		this.acct_no = acct_no;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
    
	
}
