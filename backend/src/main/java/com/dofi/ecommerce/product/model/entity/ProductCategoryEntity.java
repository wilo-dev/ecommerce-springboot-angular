package com.dofi.ecommerce.product.model.entity;

import com.dofi.ecommerce.util.IdEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategoryEntity extends IdEntity {

    @Column(name= "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<ProductEntity> products;
}
