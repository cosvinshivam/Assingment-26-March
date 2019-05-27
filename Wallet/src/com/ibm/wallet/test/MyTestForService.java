package com.ibm.wallet.test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.ibm.wallet.bean.Wallet;
import com.ibm.wallet.service.WalletServiceClass;


@TestInstance(Lifecycle.PER_CLASS)
class MyTestForService {
	WalletServiceClass ws;
	Wallet w;
	public MyTestForService() {
		
		//w.setAcct_no(8);
		
	}
	
	@BeforeEach
	void forEvery()
	{
		ws=new WalletServiceClass();
	    w=new Wallet();	
	    w.setAcct_no(761403);
		w.setAddress("noida");
		w.setBalance(800);
		w.setContact("1087957980");
		w.setName("Nihal");	
	}
//	@Test
//  	void testforAccOpen() {
//		assertEquals(1,ws.open_Acc(w));
//	}
	@Test
  	void testforAccExist() {
		WalletServiceClass ws=new WalletServiceClass();
		Wallet w=new Wallet();
		 w.setAcct_no(89);
	    assertEquals(false,ws.isExist(w));
	   // System.out.println("hello");
		assumeTrue(ws.isExist(w));
		System.out.println("assuming.........");
		
	}
	@Test
	void checkArrayEquals()
	{
        String[] expectedOutput = {"Shivam", "Shukla", "IBM"};
        String[] methodOutput = {"Shivam", "Nitin", "BMI"};
        assertArrayEquals(expectedOutput, methodOutput);
	}
	@Test
  	void testforBalance() {
		WalletServiceClass ws=new WalletServiceClass();
		Wallet w=new Wallet();
		assertEquals(false,ws.checkBalance(w));
  	}
	@Test
  	void testforLowBalance() {
		WalletServiceClass ws=new WalletServiceClass();
		Wallet w=new Wallet();
		assertEquals(false,ws.lowbalance(w));
	
  	}
	
	
}