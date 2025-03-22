package com.ecristobale.hexagonal.domain.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Product {
    // Business model: class described by business expert (domain expert, not programmer)

    /*
     * Example description:
     *    "In the catalog a product has a name, a description, a price and a currency.
     *    We also have an identifier which identifies the product in the catalog"
     *
     *  (From that description, we can start coding the class)
     */

    private String productId;
    private String name;
    private String description;
    // Validations for saving methods with
    // entities annotated with @Valid like: save(@Valid Product product)
    @NotNull
    @Min(value = 0, message = "Price must be positive")
    private BigDecimal price;
    @NotNull
    @Pattern(regexp = "[$€]", message = "Currency must be either '$' or '€'")
    private String currency;


}
