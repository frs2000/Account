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
    public void putMoney(@RequestParam int toAccountID, int amount) {
        transactionService.putMoney(toAccountID, amount);
    }

    @PutMapping("/withdraw")
    public void withdrawMoney(@RequestParam int fromAccountID, int amount) {
        transactionService.withdrawMoney(fromAccountID, amount);
    }

    @PutMapping("/transfer")
    public void transferMoney(@RequestParam int fromAccountID, int amount, int toAccountID) {
        transactionService.transferMoney(fromAccountID, amount, toAccountID);
    }
}
