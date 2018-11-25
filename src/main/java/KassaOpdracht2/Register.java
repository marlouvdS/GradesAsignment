package KassaOpdracht2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Register extends ShoppingCart {
    public Register(String name, double price) {
        super(name, price);
    }

    static double subTotal() {
        LocalDate today = LocalDate.now();
        int robijns = 0;
        int luiers = 0;
        double discount = 0;
        double subTotal = 0;
        for (Product i : shoppingCart) {
            if (today.getDayOfWeek().equals(DayOfWeek.WEDNESDAY) & i.getName().equals("Kwark")) {
                i.setPrice(1.0);
                discount += 1.0;
            }
            if (i.getName().equals("Robijn")) {
                robijns++;
                if (robijns == 2) {
                    i.setPrice(1.14);
                    discount += 1.86;
                    robijns = 0;
                } else {
                    i.setPrice(3.0);
                }

            }
            if (i.getName().equals("Luiers")) {
                luiers++;
                if (luiers == 4) {
                    i.setPrice(0.0);
                    discount += 10;
                    luiers = 0;
                } else {
                    i.setPrice(10);
                }

            }

            System.out.println(i.getName() + "  " + i.getPrice());
            subTotal += i.getPrice();
        }
        System.out.println("discount is "+discount);
        System.out.println("subtotal is "+subTotal);
        return subTotal;
    }

    static double change (double money){
        double subtotal = subTotal();
        double change = money-subtotal;
        System.out.println("change is " +change);
        return change;
    }
}
