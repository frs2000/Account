package com.example.transaction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Transaction {
    private int accountID;
    private int amount;
    private int recipientID;
}
