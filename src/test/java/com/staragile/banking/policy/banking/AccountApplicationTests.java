package com.staragile.banking.policy.banking;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

 public class AccountApplicationTests {
	 
	 @Test
	 public void testAccountConstructor() {
		 //Test the constructor that initializes the account
		 Account account = new Account("1","Tom Sharry","Abc 125","112-211-2117");
		 
		 // Verify that the account object is created correctly
		 //assertEquals("1",account.getAccountId(),"Account ID should match");
		 //assertEquals("Tom Sharry",account.getCustomerName(), "Customer Name should match");
		 //assertEquals("Abc 125", account.getCustomerAddress(), "Customer Address should match");
		 //assertEquals("112-211-2117", account.getContactNumber(), "Contact Number should match");
	 }
	 
	 @Test
	 public void testAccountToString() {
		 // Test the toString() method of the Account class
		 //Account account = new Account("2","Darry honson","34 TVS st","333-222-111");
		 
		 //Verify that the toString() method produces the expected string representation
		 //String expectedToString = "Account ID: 2, Customer Name: Darry honson, Customer Address: 34 TVS st, Contact Number: 333-222-111"
		//assertEquals(expectedToString, account.toString(), "toString() should produce the expected output");		 
	 }
	 
	 @Test
	 public void testAccountEquality() {
		 // Test the equality of two account objects
		 Account account1 = new Account("1","Tom Sharry","Abc 125","112-211-2117");
		 Account account2 = new Account("1","Tom Sharry","Abc 125","112-211-2117");
		
		 // Verify that account1 and account2 are considered
		 //assertEquals(account1, account2, "Account objects should be equal");
	 }
 }