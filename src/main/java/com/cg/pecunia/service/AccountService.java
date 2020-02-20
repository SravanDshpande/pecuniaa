package com.cg.pecunia.service;

import java.util.List;

import com.cg.pecunia.bean.Account;
import com.cg.pecunia.exception.AccountException;

public interface AccountService {
	public String addAccount(Account account) throws AccountException;
	
	public Account updateAccountByNumber(String accountNumber,Account account)throws AccountException;
	
	public String deleteAccountByNumber(String accountNumber, Account account)throws AccountException;
	
	public List<Account> listAccounts() throws AccountException; 
    
	public boolean validateName(String accountName)throws AccountException;
	
	public boolean validatePan(String accountPan)throws AccountException;
	
	public boolean validateContact(String accountContact)throws AccountException;
	
	public boolean validateAadhar(String accountAadhar)throws AccountException;
	
	public boolean validateGender(String accountGender)throws AccountException;
	
	public boolean validateDob(String accountDate)throws AccountException;

}
