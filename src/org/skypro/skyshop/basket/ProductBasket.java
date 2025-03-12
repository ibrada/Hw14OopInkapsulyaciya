package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Arrays;

public class ProductBasket {

    private static Product[] products = new Product[5];


    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public void printBasket() {
        for (Product product : products) {
            System.out.println(product);
        }
//        System.out.println(totalPrice());
    }


    public int totalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice = totalPrice + products[i].getProductPrice();
        }
        return totalPrice;
    }

    public boolean findProductByName(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void removeAllProducts() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }

//    public void removeAllProducts() {
//        Arrays.fill(products, null);
//    }


}
