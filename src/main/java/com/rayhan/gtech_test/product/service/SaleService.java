package com.rayhan.gtech_test.product.service;

import com.rayhan.gtech_test.product.dto.SaleResponse;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    public SaleResponse getReport() {
        SaleResponse res = new SaleResponse();
        return res;
    }
}
