package com.example.customer.Service;

import com.example.customer.Model.Bank;
import com.example.customer.Repo.BankRepo;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankService {
    @Autowired
    BankRepo bankRepo;

    public List<Bank> getBanks(){
        return(List<Bank>) bankRepo.findAll();
    }
    public void createBanks(Bank bank){
        bankRepo.save(bank);
    }

}
