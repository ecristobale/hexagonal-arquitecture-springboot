package com.ecristobale.hexagonal.usecase;

import com.ecristobale.hexagonal.domain.model.Product;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductInteractorImpl implements IProductInteractor {

    private final ProductRepositoryPort productRepositoryPort;

    @Override
    public Product findProductByProductId(String productId) {
        return productRepositoryPort.findProductByProductId(productId);
    }
}
