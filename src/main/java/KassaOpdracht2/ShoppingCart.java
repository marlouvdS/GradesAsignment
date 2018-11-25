package KassaOpdracht2;

import java.util.ArrayList;

 class ShoppingCart extends Product {
    ShoppingCart(String name, double price) {
        super(name, price);
    }

    static ArrayList<Product> shoppingCart = new ArrayList<>();

    static void addProduct(Product product) {
        shoppingCart.add(product);
    }

    static void removeProduct(Product product) {
        shoppingCart.remove(product);
    }

}