package com.ibm.wallet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

import com.ibm.wallet.bean.Wallet;

public class WalletDaoClass implements WalletDaoInterface {
  Connection con;
  Statement stmt;
  PreparedStatement pstmt;
	@Override
	public void dbcon() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet_ibm?useUnicode=true&u"
					+ "seJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root","");
		stmt = con.createStatement();
		
		} catch (SQLException | ClassNotFoundException e) {
   System.out.println("Some issue occured:"+e);
		}
	
	}

	@Override
	public int open_Acc(Wallet w) {
		this.dbcon();
		int flag=0;
		String sql="insert into user_detail values(?,?,?,?)";
		String sql1="insert into amount_table values(?,?)";
		try {
			pstmt=con.prepareStatement(sql);
		PreparedStatement ps=con.prepareStatement(sql1);
			pstmt.setLong(1, w.getAcct_no());
			pstmt.setString(2,w.getName() );
			System.out.println("NAME:"+w.getName());
			pstmt.setLong(3, Long.parseLong(w.getContact()));
			pstmt.setString(4,w.getAddress());
			ps.setLong(1, w.getAcct_no());
			ps.setLong(2, w.getBalance());
			if(pstmt.executeUpdate()>0&& ps.executeUpdate()>0)
			flag=1;
			else
				flag=0;
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		if(flag==1)
			return 1;
		else
			return 0;
		
	}

	@Override
	public void withdraw(Wallet w) {
		this.dbcon();
		String sql="update amount_table set acct_balance=acct_balance - '"+w.getBalance()+"' where acct_no=?";
		String sql1="insert into user_logs values(?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
		    PreparedStatement ps=con.prepareStatement(sql);
			pstmt.setLong(1, w.getAcct_no());
		    PreparedStatement ps1=con.prepareStatement(sql1);
			ps1.setLong(1, w.getAcct_no());
			ps1.setLong(2, w.getAcct_no());
			ps1.setString(3,w.getBalance()+" has been debited from ur account on "+new Date());
			ps1.setString(4,"Debited");
			 java.sql.Date sqldate=new  java.sql.Date(new Date().getTime());
			ps1.setDate(5,sqldate);
		   if(pstmt.executeUpdate()>0 && ps1.executeUpdate()>0)
			System.out.println("Your Account has been debited with "+w.getBalance()+"rs.\nplease contact us (1800 200),If this Transaction "
						+ "is not done by you....");
		   else
			   System.out.println("Server Down..............");
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		
		
	}

	@Override
	public void fund_Transfer(Wallet w,long bal,long receiver ) {
		this.dbcon();
		String sql="update amount_table set acct_balance=acct_balance - ? where acct_no=?";
		String sql1="update amount_table set acct_balance=acct_balance + ? where acct_no=?";
		String sql2="insert into user_logs values(?,?,?,?,?)";
		try {
		PreparedStatement	psender=con.prepareStatement(sql);
		PreparedStatement	preceiver=con.prepareStatement(sql1);
		    psender.setLong(1,bal );
		    psender.setLong(2, w.getAcct_no());
			preceiver.setLong(1, bal);
			preceiver.setLong(2,w.getAcct_no());
			 PreparedStatement ps=con.prepareStatement(sql2);
				ps.setLong(1, w.getAcct_no());
				ps.setLong(2, w.getTacct_no());
				ps.setString(3,bal+" has been credited in  account on  "+new Date());
				ps.setString(4,"Fund Transfer");
				 java.sql.Date sqldate=new  java.sql.Date(new Date().getTime());
				ps.setDate(5,sqldate);

			if(preceiver.executeUpdate()>0&& psender.executeUpdate()>0&& ps.executeUpdate()>0)
				System.out.println("Fund Transfered Sucessfully ....... ");
			else
				System.out.println("Server Issue Pls try again after some time.....!");
				
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		
	}

	@Override
	public void deposit(Wallet w) {
		this.dbcon();
		String sql="update amount_table set acct_balance=acct_balance + '"+w.getBalance()+"' where acct_no=?";
		String sql1="insert into user_logs values(?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
		    PreparedStatement ps=con.prepareStatement(sql1);
			pstmt.setLong(1, w.getAcct_no());
			ps.setLong(1, w.getAcct_no());
			ps.setLong(2, w.getAcct_no());
			ps.setString(3,w.getBalance()+" has been credited in ur account on  "+new Date());
			ps.setString(4,"Credited");
			 java.sql.Date sqldate=new  java.sql.Date(new Date().getTime());
			ps.setDate(5,sqldate);

		   if(pstmt.executeUpdate()>0&& ps.executeUpdate()>0)
			System.out.println("Your Amount has been succesfully deposited !!!! ");
		   else
			   System.out.println("Server Down..............");
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		
	}

	@Override
	public void print_Transctions(Wallet w,String ch) {
		String sql="select * from user_logs where acct_no=?";
		//System.out.println(ch);
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setLong(1, w.getAcct_no());
		    ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {     	//System.out.println(rs.getString(3));
            	if(rs.getString(4).equals(ch))
                System.out.println("Transaction Record:"+rs.getInt(1)+"->"+rs.getInt(2)+" "+rs.getString(3)+" on "+rs.getDate(5)+" "+rs.getString(4));
            	else if(rs.getString(4).equals(ch))
                System.out.println("Transaction Record:"+rs.getInt(1)+"->"+rs.getInt(2)+" "+rs.getString(3)+" on "+rs.getDate(5)+" "+rs.getString(4));
            	else if(rs.getString(4).equals(ch))
                System.out.println("Transaction Record:"+rs.getInt(1)+"->"+rs.getInt(2)+" "+rs.getString(3)+" on "+rs.getDate(5)+" "+rs.getString(4));
            }
            
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		
	}

	@Override
	public boolean lowbalance(Wallet w) {
		this.dbcon();
		int flag=0;
		String sql="select * from amount_table where acct_no=?";
		try {
			pstmt=con.prepareStatement(sql);
		    PreparedStatement ps=con.prepareStatement(sql);
			pstmt.setLong(1, w.getAcct_no());
		    ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
            	if(rs.getLong(2)<=3000)
            		flag=1;
            	else
            		flag=0;
            }
            
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		if(flag==1)
		    return true;
		else
			return false;
		
	}

	@Override
	public boolean checkBalance(Wallet w) {
		this.dbcon();
		int flag=0;
		String sql="select * from amount_table where acct_no=?";
		try {
			pstmt=con.prepareStatement(sql);
		    PreparedStatement ps=con.prepareStatement(sql);
			pstmt.setLong(1, w.getAcct_no());
		    ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
            	if(rs.getLong(2)>w.getBalance())
            		flag=1;
            	else 
            	    flag=0;
            }
            
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		if(flag==1)
		return true;
		else
		return false;
	}

	@Override
	public boolean isExist(Wallet w) {
		
		this.dbcon();
		int flag=0;
		String sql="select * from amount_table";
		try {
			pstmt=con.prepareStatement(sql);
		    PreparedStatement ps=con.prepareStatement(sql);
		    ResultSet rs=pstmt.executeQuery();
            while(rs.next())
            {
            	if(rs.getLong(1)==w.getAcct_no())
            	{	flag=1;
            	    break;
            	}
            	else 
            	    flag=0;
            }
            
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		if(flag==1)
		return true;
		else
		return false;
	}

	@Override
	public void show_balance(Wallet w) {
		String sql="select * from amount_table where acct_no=?";
		try {
			pstmt=con.prepareStatement(sql);
		    PreparedStatement ps=con.prepareStatement(sql);
			pstmt.setLong(1, w.getAcct_no());
		    ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
            	System.out.println("Your Account Balance is "+rs.getLong(2));
            	
            }
            
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		
	}

	public void acc_detail(Wallet w) {
		String sql="select * from user_detail where acct_no=?";
		try {
			pstmt=con.prepareStatement(sql);
		    PreparedStatement ps=con.prepareStatement(sql);
			pstmt.setLong(1, w.getAcct_no());
		    ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
            	System.out.println("Account Numbe: "+rs.getLong(1));
            	System.out.println("Account Holder Name:"+rs.getString(2));
            	System.out.println("Contact Number: "+rs.getLong(3));
            	System.out.println("Address: "+rs.getString(4));
             }
            
			
		} catch (SQLException e) {
	   System.out.println("Some issue occured:"+e);	
		}
		
	}





}
