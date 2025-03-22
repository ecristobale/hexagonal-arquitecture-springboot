package com.ecristobale.hexagonal.infrastructure.database.h2.mapper;

import com.ecristobale.hexagonal.domain.model.Product;
import com.ecristobale.hexagonal.infrastructure.database.h2.entity.ProductEntity;

public class ProductEntityMapper {

    public static Product fromEntityToProduct(ProductEntity productEntity) {
        return new Product(
                productEntity.getProductId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getPrice(),
                productEntity.getCurrency());
    }
}
