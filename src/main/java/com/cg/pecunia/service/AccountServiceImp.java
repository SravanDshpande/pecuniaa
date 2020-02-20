package com.cg.pecunia.service;

import java.util.List;
import java.util.Random;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.dao.AccountDao;
import com.cg.pecunia.dao.AccountDaoImp;
import com.cg.pecunia.exception.AccountException;

public class AccountServiceImp implements AccountService {
	
	private AccountDao accountdao;

	public AccountServiceImp() {
		accountdao = new AccountDaoImp();
	}

	public String addAccount(Account account) throws AccountException {
		// TODO Auto-generated method stub
		
		if (!validateName(account.getAccountName()))
			throw new AccountException("Customer Name: Only alphabets allowed. ");
		if (!validatePan(account.getPan()))
			throw new AccountException("Customer PAN: First 5 characters should be alphabets, next 4 should be digits and the last character should be an alphabet.");
		
		if (!validateContact(account.getContactNumber()))
			throw new AccountException("Customer Name: Only alphabets allowed. ");
		
		if (!validateAadhar(account.getAadhar()))
			throw new AccountException("Customer Aadhar: Only 12-digit numbers allowed. ");
		
		if (!validateGender(account.getGender()))
			throw new AccountException("Customer Gender: Male/Female fields are accepted. ");
		
		if (!validateDob(account.getDob()))
			throw new AccountException("customer date of birth is invalid");
		
		Random random = new Random();

		int accnumber = random.nextInt(100000000) + 1000000000;
		String aid ="11"+String.valueOf(accnumber);
		
		return aid;
	}

	public Account updateAccountByNumber(String accountNumber, Account account) throws AccountException {
		// TODO Auto-generated method stub
		return accountdao.updateAccountByNumber(accountNumber, account);
	}

	public String deleteAccountByNumber(String accountNumber,Account account) throws AccountException {
		// TODO Auto-generated method stub
		return accountdao.deleteAccountByNumber(accountNumber,account);
	}

	public List<Account> listAccounts() throws AccountException {
		// TODO Auto-generated method stub
		return accountdao.listAccounts();
	}
	public boolean validateName(String accountName) throws AccountException {
		return accountName.matches("[A-Za-z]+");

	}
	
	public boolean validatePan(String accountPan) throws AccountException {
		return accountPan.matches("([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$");

	}
	
	public boolean validateContact(String accountContact) throws AccountException {
		return accountContact.matches("[1-9]{10}");

	}
	
	public boolean validateAadhar(String accountAadhar) throws AccountException {
		return accountAadhar.matches("[1-9]{12}");

	}
	
	public boolean validateGender(String accountGender) throws AccountException {
		if((accountGender.equals("Male"))&&(accountGender.equals("Female")))
				return true;
return false;
	}
	
	public boolean validateDob(String accountDob) throws AccountException {
		return accountDob.matches("[mm/dd/yyyy]");
	}

	
}
