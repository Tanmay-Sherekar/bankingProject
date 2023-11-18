package com.staragile.banking.policy.banking;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	
	@Autowired
	PolicyService policySvc;
	
	@RequestMapping("hello")
	public String doSomething(){
		return "Hello World!!!";
	}
	
	@RequestMapping("/account/{id}")
	public Optional<Account> getAccount(@PathVariable String id){
		System.out.println("Inside getAccount");
		return accountSvc.getAccount(id);
	}
	
	@RequestMapping("/account")
	public List<Account> getAccounts(){
		return accountSvc.getAccounts();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/account")
	public String addPolicy(@RequestBody Account account) {
		accountSvc.addAccount(account);
		return "Successfully added!!";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/account/{id}")
	public String updatePolicy(@RequestBody Account account, @PathVariable String id) {
		accountSvc.updatePolicy(id, account);
		return "Updated successfully";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/account/{id}")
	public String deleteAccount(@PathVariable String id) {
		accountSvc.delete(id);
		return "Updated successfully";
	}
