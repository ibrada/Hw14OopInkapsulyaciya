package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {

    private int basePrise;
    private int discount;

    public DiscountedProduct(String name, int basePrise, int discount) {
        super(name);
        this.basePrise = basePrise;
        this.discount = discount;
    }

    @Override
    public int getPrice() {
        return basePrise - basePrise * discount / 100;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    public int getBasePrise() {
        return basePrise;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Имя продукта со скидкой " + getName() + ", стоимость " + basePrise + " ,скидка " + discount + "%, цена со скидкой " + getPrice();
    }
}
