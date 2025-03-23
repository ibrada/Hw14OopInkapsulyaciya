package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final int FIX_PRICE = 100;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIX_PRICE;
    }

    @Override
    public String toString() {
        return "Имя продукта с фиксированной ценой: " + getName() + " ,фиксированная цена: " + FIX_PRICE;
    }
}
