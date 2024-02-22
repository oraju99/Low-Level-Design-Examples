package com.example.Store;

import lombok.Data;

import java.util.Map;

@Data
public class StoreInventory {
    Map<String, Integer> inventory; // what all products are available and their quantity
    // product ID --> key
    // value --> number of products available in stock
}
