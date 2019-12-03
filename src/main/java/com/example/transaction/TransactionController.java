package com.example.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    private TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PutMapping("/put")
    public void putMoney(@RequestParam int toAccount, int amount) {
        transactionService.putMoney(toAccount, amount);
    }

    @PutMapping("/withdraw")
    public void withdrawMoney(@RequestParam int fromAccount, int amount) {
        transactionService.withdrawMoney(fromAccount, amount);
    }

    @PutMapping("/transfer")
    public void transferMoney(@RequestParam int fromAccount, int amount, int toAccount) {
        transactionService.transferMoney(fromAccount, amount, toAccount);
    }
}
