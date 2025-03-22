package com.ecristobale.hexagonal.infrastructure.rest.mapper;

import com.ecristobale.hexagonal.domain.model.Product;
import com.ecristobale.hexagonal.infrastructure.rest.dto.ProductDto;

public class ProductDtoMapper {

    public static ProductDto fromProductToProductDto(Product product) {
        return new ProductDto(
                product.getProductId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCurrency());
    }
}
