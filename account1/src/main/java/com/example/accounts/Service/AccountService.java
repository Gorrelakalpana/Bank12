package com.example.accounts.Service;

import com.example.accounts.Model.Account;
import com.example.accounts.Repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepo accountRepo;


    public List<Account> getAccounts() {
        return (List<Account>) accountRepo.findAll();

    }


    public Account createAccounts(Account account) {
        return accountRepo.save(account);
    }
}
