package com.example.customer.Repo;

import com.example.customer.Model.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends MongoRepository<Bank,Integer> {
}
