package com.example.accounts.Controller;

import com.example.accounts.Model.Account;
import com.example.accounts.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acc")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/getaccount")
    public List<Account> getAccount() {
        return accountService.getAccounts();
    }

    @PostMapping("/create")
    public Account  createAccounts(@RequestBody Account account) {
        Account account1=accountService.createAccounts(account);
        return account1;

    }
}
