package com.ecristobale.hexagonal.usecase;

import com.ecristobale.hexagonal.domain.model.Product;

public interface ProductRepositoryPort {
    Product findProductByProductId(String productId);
}
