package com.example.account;

import com.example.transaction.Transaction;
import com.example.transaction.TransactionDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @PutMapping("/put")
    public void putMoney (@RequestBody TransactionDTO transactionDTO) {
    }

    @PutMapping("/withdraw")
    public void withdrawMoney(@RequestBody TransactionDTO transactionDTO) {
    }

    @PutMapping("/transfer")
    public void transferMoney(@RequestBody Transaction transaction) {
    }
}
