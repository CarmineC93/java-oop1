package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        //variabile flag
        boolean exitCount = false;

        Scanner scan = new Scanner(System.in);
        //chiedo il nome
        System.out.print("What's your account name? ");
        String userName = scan.nextLine();
        //istanzo un conto
        Count count1 = new Count(userName);

        //con un do while l'utente potrà scegliere di fare altre operazioni dopo la prima o uscire dal conto
        do{
            System.out.println("Which operation do you want to do? " + " " +
                        "1) Deposit money" + " " +
                        "2) Withdraw money" + " " +
                        "3) Exit");
                //trasformo la scelta in un intero
                int operation = Integer.parseInt(scan.nextLine());

            if(operation == 1){
                    //chiedo quanto denaro depositare

                    System.out.println("Money to deposit on your bank account: ");
                    double putOnMoney = Double.parseDouble(scan.nextLine());
                    //in base all'importo caricato eseguo il metodo che aggiornerà il saldo
                    count1.putMoney(putOnMoney);
                    System.out.println("THANK YOU, OPERATION COMPLETED :)");
                    System.out.println("These are your account data and your actual balance: " + count1.getCountInfo());

/*                    System.out.println("Do you want do something else (back to the menu)? : Y / N");
                    String userChoice = scan.nextLine();

                    if(userChoice == "Y"){
                        exitCount = false;
                    } else if (userChoice == "N") {
                        exitCount = true;
                    }*/
                }
                else if (operation == 2) {
                    //chiedo quanto denaro prelevare

                    System.out.println("Money to take from you count: ");
                    double takenMoney = Double.parseDouble(scan.nextLine());
                    //in base all'importo prelevato eseguo il metodo che aggiornerà il saldo
                    if(count1.takeMoney(takenMoney)){
                        System.out.println("OPERATION SUCCESSFULLY COMPLETED :) ");
                        System.out.println("These are your account data and your actual balance: "+ count1.getCountInfo());
                    }else{
                        System.out.println("NOT ENOUGH FUNDS ON YOUR BANK ACCOUNT :( ");
                        System.out.println("These are your account data and your actual balance: "+ count1.getCountInfo());
                    }

/*                    System.out.println("Do you want do something else (back to the menu)? : Y / N");
                    String userChoice = scan.nextLine();

                    if(userChoice == "Y"){
                        exitCount = false;
                    } else if (userChoice == "N") {
                        exitCount = true;
                    }*/
                }
                else if (operation == 3){
                    System.out.println("See you soon, bye!");
                    exitCount  = true;
                }
                //intercetto eventuali errori di digitazione numerica
                else {
                    System.out.println("Please select a valid operation number");
                }

        }while(!exitCount);



        scan.close();
    }
}
