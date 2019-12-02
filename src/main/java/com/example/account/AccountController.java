package com.example.account;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/account")
public class AccountController {

    @PutMapping(path="/put")
    public void putMoney (@RequestParam int accountID, int amount) {
    }

    @PutMapping(path="/withdraw")
    public void withdrawMoney(@RequestParam int accountID, int amount) {
    }

    @PutMapping(path="/withdraw")
    public void transferMoney(@RequestParam int accountID, int amount, int recipientID) {
    }
}
