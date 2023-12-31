package com.staragile.banking.policy.banking;

import java.util.Objects;
import java.util.objects;

@Entity
public class Account {
	@Id
	String AccountId;
	String customerName;
	String customerAddress;
	String contactNumber;
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if(o == null || getClass() != o.getClass()) return false; 
		Account account = (Account) o;
		return Objects.equals(getAccountId(),account.getAccountId()) &&
				Objects.equals(getCustomerName(),account.getCustomerName()) &&
				Objects.equals(getCustomerAddress(),account.getCustomerAddress()) &&
				Objects.equals(getContactNumber(),account.getContactNumber());
	}
	
	@Override
	public String toString() {
		return "Account ID: " + getAccountId() +
				", Customer Name: " + getCustomerName() +
				", Customer Address: " + getCustomerAddress() +
				", Contact Number: " + getContactNumber();
	}
	@Override
	public int hashcode() {
		return Objects.hash(getAccountId(),getCustomerName(),getCustomerAddress(),getContactNumber());
	}
	public Account() {
		super();
	}
	public Account(String AccountId, String customerName, String customerAddress, String contactNumber) {
		super();
		this.AccountId = AccountId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.contactNumber = contactNumber;
	}
	
	public String getAccountId() {
		return AccountId;
	}
	public void setAccountId(String AccountId) {
		this.AccountId = AccountId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setcontactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}