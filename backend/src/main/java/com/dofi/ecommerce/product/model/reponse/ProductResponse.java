package com.dofi.ecommerce.product.model.reponse;

import com.dofi.ecommerce.product.model.entity.ProductEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
public class ProductResponse {

    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;
    private Boolean active;
    private int stock;

    public ProductResponse(ProductEntity p) {
        this.id = p.getId();
        this.sku = p.getSku();
        this.name = p.getName();
        this.description = p.getDescription();
        this.price = p.getPrice();
        this.image = p.getImage();
        this.active = p.getActive();
        this.stock = p.getStock();
    }
}
