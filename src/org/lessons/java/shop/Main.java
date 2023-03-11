package org.lessons.java.shop;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

//PRIMO PRODOTTO
        System.out.println("*********** PRIMO prodotto");

        //istanzo un PRIMO prodotto con un costruttore che genera un attributo codice randomico
        Product item1 = new Product();
        //stampo attributi abilitati alla sola lettura
        System.out.println("primo codice: " + item1.getCode());

        //valorizzo attributi abilitati alla scrittura tramite setter
        item1.setName("SIGMOORDON");
        item1.setDescription("Beautiful IKEA desk in real norwegian black wood....");
        item1.setPrice(105.99);
        item1.setIva(22);

        //stampo attributi abilitati alla scrittura tramite getter
        System.out.println("codice: " + item1.getCode());
        System.out.println("nome: " + item1.getName());
        System.out.println("nome completo: " + item1.completeName());
        System.out.println("descrizione: " + item1.getDescription());
        System.out.println("prezzo ivato: " + item1.priceWithIva());
        System.out.println("prezzo senza iva: " + item1.priceWithoutIva());
        System.out.println("iva: " + item1.getIva() + "%");


//SECONDO PRODOTTO
        System.out.println("*********** SECONDO prodotto");

        //istanzo un SECONDO prodotto con un nuovo costruttore
        Product item2 = new Product("OLAFSSON", "Chair IKEA made in real indian red wood....", 120, 22);
        System.out.println("codice: " + item2.getCode());
        System.out.println("nome: " + item2.getName());
        System.out.println("nome completo: " + item2.completeName());
        System.out.println("descrizione: " + item2.getDescription());
        System.out.println("prezzo ivato: " + item2.priceWithIva());
        System.out.println("prezzo senza iva: " + item2.priceWithoutIva());
        System.out.println("iva: " + item2.getIva()  + "%");

        System.out.println("codice: " + item2.codeWithZeros());



//ALTRI PRODOTTI
        System.out.println("***********ALTRI PRODOTTI");
        //creo e riempio un array di prodotti
        Product[] products = new Product[5];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            System.out.println("codice altro prodotto: " + (products[i].getCode()));
        }
    }
}