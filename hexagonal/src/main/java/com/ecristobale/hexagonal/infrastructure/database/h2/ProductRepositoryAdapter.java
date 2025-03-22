package com.ecristobale.hexagonal.infrastructure.database.h2;

import com.ecristobale.hexagonal.domain.model.Product;
import com.ecristobale.hexagonal.domain.repository.ProductRepositoryPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final ProductJpaRepository productJpaRepository;

    @Override
    public Product findProductByProductId(String productId) {
        // This method is returning a domain model (Product) instead of an entity (ProductEntity)
        // It is needed a mapper to convert from ProductEntity to Product
        // A mapper is considered an anti corruption layer (in DDD)
        return ProductJpaRepository.findByProductId(productId);
    }
}
