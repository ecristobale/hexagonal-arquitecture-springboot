package com.ecristobale.hexagonal.infrastructure.rest.dto;

import com.ecristobale.hexagonal.infrastructure.rest.util.PriceFormatter;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDto {

    private String productId;
    private String name;
    private String description;
    private String price;

    public ProductDto(String productId, String name, String description, BigDecimal price, String currency) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = PriceFormatter.formatPrice(price, currency);
    }
}
