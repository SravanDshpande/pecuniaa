package com.cg.pecunia.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.exception.AccountException;
import com.cg.pecunia.service.AccountService;
import com.cg.pecunia.service.AccountServiceImp;

public class Customer {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account account=new Account();
		AccountService acountservice=new AccountServiceImp();
		List<Account> list=null;
		while(true)
		{
			System.out.println("1. Add Account");
			System.out.println("2. Update Account");
			System.out.println("3.Delete Account");
			System.out.println("4. List all Accounts");
			System.out.println("5. Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			try
			{
				System.out.println(account);
				System.out.println("Please Enter account Name");
				String name = sc.nextLine();
				account.setAccountName(name);
				sc.nextLine();
				System.out.println("Please Enter Address");
				String address = sc.nextLine();
				account.setAddress(address);
				System.out.println("Please Enter Contact");
				String contact=sc.nextLine();
	 			account.setContactNumber(contact);
				System.out.println("Please Enter Date-of-birth");
				String dob=sc.nextLine();
				account.setDob(dob);
				System.out.println("Please Enter Aadhar");
				String aadhar=sc.nextLine();
				account.setAadhar(aadhar);
				System.out.println("Please Enter pan");
				String pan=sc.nextLine();
				account.setPan(pan);
				account.setBalance(0);
				
			
				String accnumber = acountservice.addAccount(account); 
				
				System.out.println("accountNumber = "+accnumber);
				
				

			}
			catch(AccountException e)
			{
				System.err.println(e.getMessage());
			}
			break;
			case 2:
				try
				{
					System.out.println("Please Enter account Number");
					String accountNumber=sc.nextLine();
					System.out.println("Please Enter account Name");
					String name = sc.nextLine();
					System.out.println("Please Enter Address");
					String address = sc.nextLine();
					System.out.println("Please Enter Contact");
					String contact=sc.nextLine();
					account=acountservice.updateAccountByNumber(accountNumber,account);
					System.out.println("updated details");
					System.out.println("name = "+name);
					System.out.println("contact = "+contact);
					System.out.println("address = "+address);
				}
				catch(AccountException e)
				{
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				try
				{
					System.out.println("Please Enter account number");
					String accountNumber=sc.nextLine();
					String s =acountservice.deleteAccountByNumber(accountNumber, account);
					System.out.println(s+" deleted account sucessfully! :(");


				}
				catch(AccountException e)
				{
					System.err.println(e.getMessage());
				}break;
			case 4:
				try
				{
					list=new ArrayList<Account>();
					list=acountservice.listAccounts();
					list.stream().forEach(p->System.out.println(p));
				}
				catch(AccountException e)
				{
					System.err.println(e.getMessage());
				}break;
					
				
			case 5:
				System.out.println("thank you");
				return;
		}
		}
}
}