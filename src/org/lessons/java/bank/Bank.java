package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //chiediamo il nome
        System.out.print("What's your name? ");
        String userName = scan.nextLine();
        //chiediamo quanto denaro caricare
        System.out.print("Money to put on you count: ");
        double putOnMoney = Double.parseDouble(scan.nextLine());
        //chiediamo quanto denaro prelevare
        System.out.print("Money to take from you count: ");
        double takenMoney = Double.parseDouble(scan.nextLine());

        //istanziamo un conto
        Count count1 = new Count(userName);

        //in base all'importo caricato eseguiamo il metodo che aggiornerà il saldo
        count1.putMoney(putOnMoney);
        //in base all'importo prelevato eseguiamo il metodo che aggiornerà il saldo
        count1.takeMoney(takenMoney);

        //stampiamo
        System.out.println("Count number: " + count1.getCountNumber());
        System.out.println("name: " + count1.getUserName());
        System.out.println("balance: " + count1.getBalance());

        System.out.println("infos: " + count1.getCountInfo());




    }
}
