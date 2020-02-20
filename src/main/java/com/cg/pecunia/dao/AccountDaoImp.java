package com.cg.pecunia.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.exception.AccountException;

public class AccountDaoImp implements AccountDao {
	HashMap<String,Account> map;
	
	public AccountDaoImp() {
		map = new HashMap<String, Account>(); 
	}

	public String addAccount(Account account) throws AccountException {
		// TODO Auto-generated method stub
		if(map.containsKey(account.getAccountNumber()))
			throw new AccountException("id exsists");
		else
			map.put(account.getAccountNumber(), account);
		return account.getAccountNumber();
	}

	public Account updateAccountByNumber(String accountNumber, Account account) throws AccountException {
		// TODO Auto-generated method stub
		
		Account updatedAccount = null; 
		if(map.containsKey(account.getAccountNumber()))
		{
			updatedAccount = map.get(accountNumber);
			
			updatedAccount.setAccountName(account.getAccountName());
			updatedAccount.setContactNumber(account.getContactNumber());
			updatedAccount.setAddress(account.getAddress());
			updatedAccount.setAccountNumber(accountNumber);
			updatedAccount.setDob(account.getDob());
			updatedAccount.setAadhar(account.getAadhar());
			updatedAccount.setPan(account.getPan());
			updatedAccount.setGender(account.getGender());
			
			
		}
		updatedAccount=map.put(accountNumber, updatedAccount);
		return updatedAccount;
		
	}

	public String deleteAccountByNumber(String accountNumber, Account account) throws AccountException {
		// TODO Auto-generated method stub
		if(!map.containsKey(accountNumber))
			map.remove(accountNumber);
		else
			throw new AccountException("Id not found");
		
		
		return accountNumber;

	}

	public List<Account> listAccounts() throws AccountException {
		// TODO Auto-generated method stub
		Collection<Account> collection=map.values();
		List<Account> list=new ArrayList<Account>();
		for(Account a:collection)
			list.add(a);
		
		return list;
	
	}

	
	
}
