package com.microservicesProject.order.dto;

import com.microservicesProject.order.model.Order;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode, BigDecimal price, Integer quantity) {

}
