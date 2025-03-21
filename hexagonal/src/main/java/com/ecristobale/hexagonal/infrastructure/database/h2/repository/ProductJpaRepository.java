package com.ecristobale.hexagonal.infrastructure.database.h2.repository;

import com.ecristobale.hexagonal.infrastructure.database.h2.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, String> {

    Optional<ProductEntity> findByProductId(String productId);
}
