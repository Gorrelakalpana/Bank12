package com.example.customer.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
@Data
public class Bank {
    private String firstName;
    private String lastName;
    private String number;

    public Bank(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }
}
