package com.ecristobale.hexagonal.infrastructure.rest.util;

import java.math.BigDecimal;

public class PriceFormatter {

    public static String formatPrice(BigDecimal price, String currency) {
        return String.format("%s %s", price, currency);
    }

}
