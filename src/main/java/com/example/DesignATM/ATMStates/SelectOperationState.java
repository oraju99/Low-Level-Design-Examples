package com.example.DesignATM.ATMStates;

import com.example.DesignATM.ATM;
import com.example.DesignATM.Card;
import com.example.DesignATM.TransactionType;

public class SelectOperationState extends ATMState {

    public SelectOperationState() {
        showOperations();
    }

    private void showOperations() {
        System.out.println("Please select the Operation");
        TransactionType.showAllTransactionTypes();
    }

    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    public void returnCard() {
        System.out.println("Please collect your card");
    }

    public void selectOperation(ATM atmObject, Card card, TransactionType txnType) {
        switch (txnType) {
            case CASH_WITHDRAWAL -> atmObject.setCurrentATMState(new CashWithdrawalState());
            case BALANCE_CHECK -> atmObject.setCurrentATMState(new CheckBalanceState());
            default -> {
                System.out.println("Invalid Option");
                exit(atmObject);
            }
        }
    }
}
