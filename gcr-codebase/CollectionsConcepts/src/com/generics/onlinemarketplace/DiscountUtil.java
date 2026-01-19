package com.generics.onlinemarketplace;

public class DiscountUtil {

    public static <T extends Product<?>> void applyDiscount(
            T product, double percentage) {

        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}
