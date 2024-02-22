package com.example.Store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class OrderService {
    void placeOrder(PlaceOrderRequest placeOrderRequest) throws Exception {
        // validations for the incoming data are done
        // customer is valid
        // store exists

        StoreManager storeManager;

        Store store = new Store();
        Map<String, Integer> inventory = store.getInventory().getInventory();
        if (inventory.containsKey(placeOrderRequest.productId) ) {
            // product exists
        } else {
            // throwing an exception product does not exists
            throw new ServiceException();
        }

        if (inventory.containsKey(placeOrderRequest.productId) &&
                inventory.get(placeOrderRequest.productId) >= placeOrderRequest.getProductQuantityOrdered()) {
            // complete the order and update the inventory
        } else {
            // show an error

        }
    }
}
