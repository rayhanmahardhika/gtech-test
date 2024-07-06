package com.rayhan.gtech_test.product.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class SaleResponse {
    private String orderNumber;
    private String orderDate;
    private String marginPrice;
    private String salePrice;

    private List<ProductResponse> products;
}
