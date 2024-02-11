package com.dofi.ecommerce.product.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String sku;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;
    private Boolean active;
    private int stock;
}
