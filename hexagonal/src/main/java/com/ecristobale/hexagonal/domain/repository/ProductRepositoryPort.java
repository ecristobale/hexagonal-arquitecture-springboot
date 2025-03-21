package com.ecristobale.hexagonal.domain.repository;

import com.ecristobale.hexagonal.domain.model.Product;

public interface ProductRepositoryPort {
    Product findProductByProductId(String productId);
}
