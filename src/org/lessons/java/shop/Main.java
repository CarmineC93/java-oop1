package org.lessons.java.shop;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

//PRIMO PRODOTTO
        System.out.println("*********** PRIMO prodotto");

        //istanzo un PRIMO prodotto
        Product item1 = new Product();
        //stampo attributi abilitati alla sola lettura
        System.out.println("primo codice: " + item1.getCode());
        //stampo attributi abilitati alla scrittura
        item1.setName("Desk black wood IKEA");
        item1.setDescription("Beautiful desk in real norwegian wood....");
        item1.setPrice(105.99);
        item1.setIva(22);

        System.out.println("codice: " + item1.getCode());
        System.out.println("nome : " + item1.getName());
        System.out.println("nome completo: " + item1.completeName());
        System.out.println("descrizione  : " + item1.getDescription());
        System.out.println("prezzo  : " + item1.priceWithIva());
        System.out.println("iva: " + item1.priceWithoutIva());


        System.out.println("*********** SECONDO prodotto");

//SECONDO PRODOTTO
        //istanzo un SECONDO prodotto con un nuovo costruttore
        Product item2 = new Product("Chair black wood", "Chair made in real indian wood IKEA", 120, 22);
        System.out.println("codice: " + item2.getCode());
        System.out.println("nome : " + item2.getName());
        System.out.println("nome completo: " + item2.completeName());
        System.out.println("descrizione  : " + item2.getDescription());
        System.out.println("prezzo  : " + item2.priceWithIva());
        System.out.println("iva: " + item2.priceWithoutIva());



        System.out.println("***********ALTRI PRODOTTI");

//ALTRI PRODOTTI
        //creo e riempio un array di prodotti
        Product[] products = new Product[5];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            System.out.println("codice prodotto in array: " + (products[i].getCode()));
        }


    }
}