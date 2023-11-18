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

@Service
public class AccountService {
	@Autowired
	AccountDAORepository AccountDAORepository;
	
	public List<Account> getAccounts(){
		List<Account> accountList = new ArrayList<Account>();
		AccountDAORepository.findAll().foreach(accountList::add);
		return accountList;
	}
	public Optional<Account> getAccount(String id){
		return AccountDAORepository.findById(id);
	}
	public void addAccount(Account account) {
		AccountDAORepository.save(account);
	}
	public void updateAccount(String id, Account account) {
		AccountDAORepository.save(account);
	}
	public void viewAccount(String id, Account account) {
		AccountDAORepository.save(account);
	}
	public void deleteAccount(String id) {
		AccountDAORepository.deleteById(id);
	}

}
