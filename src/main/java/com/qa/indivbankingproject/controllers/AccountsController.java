package com.qa.indivbankingproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.qa.indivbankingproject.models.Accounts;
import com.qa.indivbankingproject.repository.AccountsRepository;

@CrossOrigin
@RestController
@RequestMapping("/accountapp/rest/json")
public class AccountsController {
	
	@Autowired
	AccountsRepository accountsRepository;
	
//	@GetMapping
//	public List<Accounts> list() {
//		List<Accounts> accounts = new ArrayList<>();
//		return accounts;
//	}
	
	@PostMapping
	public Accounts create(@RequestBody Accounts account) {
		return accountsRepository.save(account);
	}
	
	@GetMapping
	public List<Accounts> getAll() {
		return accountsRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Accounts> get(@PathVariable String id) {
		return accountsRepository.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
	public void update(@RequestBody Accounts account) {
		accountsRepository.save(account);
	}
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable String id) {
		accountsRepository.deleteById(id);
	}
}
