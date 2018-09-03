package com.qa.indivbankingproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qa.indivbankingproject.models.Accounts;

public interface AccountsRepository extends MongoRepository<Accounts, String> {

}
