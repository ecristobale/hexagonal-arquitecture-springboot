package com.ecristobale.hexagonal.infrastructure.database.h2;

import com.ecristobale.hexagonal.domain.model.Product;
import com.ecristobale.hexagonal.domain.repository.ProductRepositoryPort;

public class ProductRepositoryAdapter implements ProductRepositoryPort {
    @Override
    public Product findProductByProductId(String productId) {
        return null;
    }
}
