package com.ecristobale.hexagonal.infrastructure.database.h2.adapter;

import com.ecristobale.hexagonal.domain.model.Product;
import com.ecristobale.hexagonal.domain.repository.ProductRepositoryPort;
import com.ecristobale.hexagonal.infrastructure.database.h2.mapper.ProductEntityMapper;
import com.ecristobale.hexagonal.infrastructure.database.h2.repository.ProductJpaRepository;
import com.ecristobale.hexagonal.infrastructure.database.h2.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Component
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final ProductJpaRepository productJpaRepository;

    @Override
    public Product findProductByProductId(String productId) {
        // This method is returning a domain model (Product) instead of an entity (ProductEntity)
        // It is needed a mapper to convert from ProductEntity to Product
        // A mapper is considered an anti corruption layer (in DDD)
        return productJpaRepository.findByProductId(productId)
                .map(ProductEntityMapper::fromEntityToProduct)
                .orElseThrow(() -> new NoSuchElementException("Product not found"));
    }
}
