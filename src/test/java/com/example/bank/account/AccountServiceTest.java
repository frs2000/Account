package com.example.bank.account;

import junit.framework.TestCase;

public class AccountServiceTest extends TestCase {

    public void testGetBalanceByID() {
        AccountService accountService = new AccountService();
        assertEquals(1, accountService.getBalanceByID(1));
    }
}