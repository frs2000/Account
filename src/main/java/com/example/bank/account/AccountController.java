package com.example.bank.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create")
    public int create(@RequestBody Account account) {
        return accountService.create(account);
    }


    @GetMapping("/getBalanceByID")
    public int getBalanceByID(@RequestParam int id) {
        return accountService.getBalanceByID(id);
    }
}
