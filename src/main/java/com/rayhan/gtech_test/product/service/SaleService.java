package com.rayhan.gtech_test.product.service;

import com.rayhan.gtech_test.product.dto.ProductResponse;
import com.rayhan.gtech_test.product.dto.SaleResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaleService {
    public SaleResponse getReport() {
        List<ProductResponse> products = new ArrayList<>();
        ProductResponse product = ProductResponse.builder()
                .productId(1L)
                .productName("Tas Laptop")
                .productType("Tas")
                .build();
        products.add(product);

        return SaleResponse.builder()
                .orderNumber("12345")
                .orderDate("2023-07-01")
                .marginPrice("50")
                .salePrice("150")
                .products(products)
                .build();
    }
}
