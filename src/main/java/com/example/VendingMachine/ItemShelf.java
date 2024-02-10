package com.example.VendingMachine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemShelf {
    int itemCode;
    Item item;
    boolean soldOut;

}
