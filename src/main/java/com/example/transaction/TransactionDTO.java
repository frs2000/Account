package com.example.transaction;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class TransactionDTO {
    private int accountID;
    private int amount;
}
