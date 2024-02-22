package com.example.Store;

import lombok.Data;

@Data
public class Store {
    String storeId;
    String address;
    String contactNumber;
    StoreInventory inventory;
}
