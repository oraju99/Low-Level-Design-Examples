package com.example.DesignATM.ATMStates;

import com.example.DesignATM.ATM;
import com.example.DesignATM.Card;

public class IdleState extends ATMState {

    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
