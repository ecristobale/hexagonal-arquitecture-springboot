package com.ecristobale.hexagonal.infrastructure.rest.controller;

import com.ecristobale.hexagonal.domain.model.Product;
import com.ecristobale.hexagonal.infrastructure.rest.mapper.ProductDtoMapper;
import com.ecristobale.hexagonal.infrastructure.rest.dto.ProductDto;
import com.ecristobale.hexagonal.usecase.IProductInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/products")
@RestController
public class ProductRestController {

    private final IProductInteractor productInteractor;

     @GetMapping("/{productId}")
     public ProductDto findProductByProductId(@PathVariable String productId) {
         Product product = productInteractor.findProductByProductId(productId);
         // It is needed a mapper to convert from Product to ProductDto
         return ProductDtoMapper.fromProductToProductDto(product);
     }
}
