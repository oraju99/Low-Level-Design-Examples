package com.example.DesignATM;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {

    private int cardNumber;
    private int cvv;
    private int expiryDate;
    private String holderName;
    static int PIN_NUMBER = 112211;
    private BankAccount bankAccount;

    public boolean isCorrectPINEntered(int pin) {
        return pin == PIN_NUMBER;
    }

    public int getBankBalance(){
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount){
        bankAccount.withDrawBalance(amount);
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
