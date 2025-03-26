package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    private static Product[] products = new Product[5];


    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("В корзине нет места");
    }

    public void printBasket() {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Общая стоимость корзины " + costOfTheHoleBasket());
        System.out.println("Специальных товаров " + countSpecial() );
    }


    public int costOfTheHoleBasket() {
        int totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                totalPrice = totalPrice + products[i].getPrice();
            }
        }
        if (totalPrice == 0) {
            System.out.println("В корзине пусто");
        }
        return totalPrice;
    }

    public int countSpecial() {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].isSpecial()) {
                count = count + 1;
            }
        }
        return count;
    }

    public boolean findProductByName(String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getName().equals(name)) {
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
