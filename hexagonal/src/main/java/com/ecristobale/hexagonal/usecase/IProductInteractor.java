package com.ecristobale.hexagonal.usecase;

import com.ecristobale.hexagonal.domain.model.Product;

public interface IProductInteractor {
    // Must return a domain model (Product)
    Product findProductByProductId(String productId);
}
