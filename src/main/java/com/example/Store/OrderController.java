package com.example.Store;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order/place-order")
    public void placeOrder(@RequestBody PlaceOrderRequest placeOrderRequest) {
        // service layer to

        orderService.placeOrder(placeOrderRequest);
    }
}
