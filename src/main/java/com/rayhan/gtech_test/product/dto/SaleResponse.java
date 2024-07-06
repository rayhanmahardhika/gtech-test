package com.rayhan.gtech_test.product.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SaleResponse {
    private String orderNumber;
    private long productId;
    private String productName;
    private String productType;

}
