package com.ecristobale.hexagonal.usecase;

import com.ecristobale.hexagonal.domain.model.Product;
import com.ecristobale.hexagonal.domain.repository.ProductRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductInteractorImpl implements IProductInteractor {

    private final ProductRepositoryPort productRepositoryPort;

    @Override
    public Product findProductByProductId(String productId) {
        return productRepositoryPort.findProductByProductId(productId);
    }
}
