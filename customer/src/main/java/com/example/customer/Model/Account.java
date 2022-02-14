package com.example.customer.Model;


import org.springframework.data.annotation.Id;

public class Account {
        @Id
        private int accountId;

        private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
