package KassaOpdracht2;

public class Register extends ShoppingCart {
    public Register(String name, double price) {
        super(name, price);
    }

    static double subTotal (){
        double subTotal=0;
        for (Product i : shoppingCart){
            subTotal+=i.getPrice();
        } return subTotal;
    }
}
