package KassaOpdracht2;

import java.util.ArrayList;

public class ShoppingCart extends Product {
    public ShoppingCart(String name, double price) {
        super(name, price);
    }

    static ArrayList<Product> shoppingCart = new ArrayList<>();

    static void addProduct(Product product) {
        shoppingCart.add(product);
    }
static void removeProduct(Product product){
        shoppingCart.remove(product);


}

}
