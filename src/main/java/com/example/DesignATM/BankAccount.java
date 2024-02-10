package com.example.DesignATM;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {

    int accountNumber;
    int balance;

    void withDrawBalance (int amount) {
        balance -= amount;
    }
}
