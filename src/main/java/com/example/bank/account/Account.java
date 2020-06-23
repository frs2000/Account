package com.example.bank.account;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Account {
    private int id;
    private String name;
    private String surname;
    private int balance;
}
