package com.rayhan.gtech_test.product.controller;

import com.rayhan.gtech_test.product.dto.SaleResponse;
import com.rayhan.gtech_test.product.service.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sales")
public class SaleController {
    private SaleService saleService;

    @GetMapping("/reports")
    public ResponseEntity<SaleResponse> getReports() {
        return ResponseEntity.ok(
                saleService.getReport()
        );
    }
}
