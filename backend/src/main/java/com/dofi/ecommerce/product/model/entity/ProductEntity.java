package com.dofi.ecommerce.product.model.entity;

import com.dofi.ecommerce.util.AuditableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class ProductEntity extends AuditableEntity {

    @ManyToMany
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategoryEntity category;
    private String sku;
    private String name;
    private String description;
    private BigDecimal price;
    private String image;
    private Boolean active;
    private int stock;

}
