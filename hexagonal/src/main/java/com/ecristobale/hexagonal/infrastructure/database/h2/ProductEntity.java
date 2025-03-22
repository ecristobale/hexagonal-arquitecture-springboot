package com.ecristobale.hexagonal.infrastructure.database.h2;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Table(name = "products")
@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String productId;
    private String name;
    private String description;
    private BigDecimal price;
    private String currency;
}
