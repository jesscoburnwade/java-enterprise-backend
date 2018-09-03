package com.qa.indivbankingproject.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="accountSequence")
public class Accounts {
	@Id
	String id;
	@Column(name = "Account_number", unique=true)
	@Size(min = 4, max = 6)
	private String accountNumber;
	@Column(name = "First_name")
	private String firstName;
	@Column(name = "Surname")
	private String surname;
	
	public Accounts() {}
	
	public Accounts(String accountNumber, String firstName, String surname) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
