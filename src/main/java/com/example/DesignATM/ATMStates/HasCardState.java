package com.example.DesignATM.ATMStates;

import com.example.DesignATM.ATM;
import com.example.DesignATM.Card;

public class HasCardState extends ATMState {

    public void authenticatePin(ATM atm, Card card, int pin){
        boolean isCorrectPinEntered = card.isCorrectPINEntered(pin);

        if(isCorrectPinEntered) {
            atm.setCurrentATMState(new SelectOperationState());
        } else {
            System.out.println("Invalid PIN Number");
            exit(atm);
        }
    }

    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    public void returnCard(){
        System.out.println("Please collect your card");
    }
}
