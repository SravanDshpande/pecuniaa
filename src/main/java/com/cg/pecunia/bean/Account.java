package com.cg.pecunia.bean;

public class Account {
	private String accountNumber;
	private String accountName;
	private String contactNumber;
	private String address;
	private String aadhar;
	private String pan;
	private String dob;
	private String gender;
	private double balance;
	
	public Account(String accountNumber, String accountName, String contactNumber, String address, double balance,
			String aadhar, String pan, String dob, String gender) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.balance = balance;
		this.aadhar = aadhar;
		this.pan = pan;
		this.dob = dob;
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Account() {
		super();
		
	}
	
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", contactNumber="
				+ contactNumber + ", address=" + address + ", balance=" + balance + ", aadhar=" + aadhar + ", pan="
				+ pan + ", dob=" + dob + ", gender=" + gender + "]";
	}

}
