package KassaOpdracht2;

public class main {
    public static void main(String[] args) {

        Product robijn = new Product("Robijn", 3.0);
        Product brinta = new Product("Brinta", 2.50);
        Product chineseGroenten = new Product("Chinese groenten", 5.0);
        Product kwark = new Product("Kwark", 2.0);
        Product luiers = new Product("Luiers", 10.0);



        ShoppingCart.addProduct(robijn);
        ShoppingCart.addProduct(robijn);
        ShoppingCart.addProduct(robijn);
        ShoppingCart.addProduct(robijn);

        ShoppingCart.addProduct(brinta);
        ShoppingCart.addProduct(kwark);
        ShoppingCart.addProduct(luiers);
        ShoppingCart.addProduct(luiers);
        ShoppingCart.addProduct(luiers);
        ShoppingCart.addProduct(luiers);
        ShoppingCart.addProduct(luiers);

ShoppingCart.viewCart();

        Register.subTotal();
        Register.change(50);

    }
}


//    Ontwerp en bouw een supermarkt-implementatie volgens de concepten die je hebt geleerd met OO.
//        De supermarkt moet in ieder geval de volgende zaken ondersteunen:
//        •	Toevoegen aan en verwijderen van producten in de winkelwagen
//        •	Afrekenen bij de kassa
//        •	Kassa moet wisselgeld kunnen berekenen en tonen
//        •	Kassa moet totale korting kunnen berekenen en tonen

//        De supermarkt bevat de volgende producten:
//        •	Robijn, 3 euro (31% korting bij aanschaf van 2x flacons)
//        •	Brinta, 2,50 euro
//        •	Chinese Groenten, 5 euro
//        •	Kwark, 2 euro (op woensdagen in de aanbieding voor 1 euro)
//        •	Luiers, 10 euro (4 halen, 3 betalen)
