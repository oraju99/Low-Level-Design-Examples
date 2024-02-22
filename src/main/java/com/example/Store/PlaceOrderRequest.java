package com.example.Store;

import lombok.Data;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

@Data
public class PlaceOrderRequest {
    @NotBlank
    String customerId;

    @NotBlank
    String productId;

    @NotBlank
    String storeId;

    @NotBlank
    Integer productQuantityOrdered;
}
