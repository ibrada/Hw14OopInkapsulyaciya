package org.skypro.skyshop;


import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {

    private static void line(String line) {
        System.out.println("--- " + line + " ---");
    }

    public static void main(String[] args) {

        ProductBasket productBasket = new ProductBasket();

        Product product = new SimpleProduct("banana", 100);
        Product product1 = new SimpleProduct("apple", 80);
        Product product2 = new DiscountedProduct("grape", 120, 10);
        Product product3 = new DiscountedProduct("tomato", 90, 20);
        Product product4 = new FixPriceProduct("bread");
        Product product5 = new FixPriceProduct("cherry");

        line("Добавление продукта в корзину");
        productBasket.addProduct(product);
        line("Получение содержимого корзины");
        productBasket.printBasket();
        line("Заполнение корзины");
        productBasket.addProduct(product1);
        productBasket.addProduct(product2);
        productBasket.addProduct(product3);
        productBasket.addProduct(product4);
        line("Получение содержимого корзины");
        productBasket.printBasket();
        line("Добавление продукта в заполненную корзину");
        productBasket.addProduct(product5);
        line("Получение стоимости корзины");
        System.out.println(productBasket.costOfTheHoleBasket());
        line("Поиск товара, который есть в корзине");
        System.out.println(productBasket.findProductByName("apple"));
        line("Поиск товара, которого нет в корзине");
        System.out.println(productBasket.findProductByName("egg"));
        line("Очистка корзины");
        productBasket.removeAllProducts();
        line("Печать содержимого пустой корзины");
        productBasket.printBasket();
        line("Получение стоимости пустой корзины");
        System.out.println(productBasket.costOfTheHoleBasket());
        line("Поиск товара по имени в пустой корзине");
        System.out.println(productBasket.findProductByName("tomato"));



    }
}