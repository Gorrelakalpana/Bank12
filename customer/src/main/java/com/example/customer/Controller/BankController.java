package com.example.customer.Controller;

import com.example.customer.Model.Account;
import com.example.customer.Model.Bank;
import com.example.customer.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/cust")
public class BankController {
    @Autowired
    BankService bankService;
    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/getbank")
    public List<Bank> getbank(){
        return bankService.getBanks();

    }
    @PostMapping("/createBank")
    public void createbank(Bank bank){
        bankService.createBanks(bank);

    }
    @PostMapping("/create/account")
    public Account addAccount(@RequestBody Account account){
        HttpEntity<Account> entity=new HttpEntity<>(account);
        return restTemplate.exchange("http://localhost:8096/acc/createaccount", HttpMethod.POST,entity,Account.class).getBody();

    }

    @GetMapping("/accounts")
    public String getAccounts(){
            return restTemplate.exchange("http://account1/acc/getaccount",
                    HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}).getBody();
        }



    }


