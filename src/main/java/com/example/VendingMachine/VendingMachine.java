package com.example.VendingMachine;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VendingMachine {

    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine() {
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }
}
