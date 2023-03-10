package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Random;

public class Count {

/*      - numero di conto
        - nome del proprietario
        - saldo*/

    private int countNumber;
    private String userName;
    private double balance;

    //CONSTRUCTORS
    public Count(String userName) {
        this.countNumber = new Random().nextInt(1001);
        this.userName = userName;
        this.balance = 0.00;
    }

    //GETTER & SETTER
    public int getCountNumber() {
        return countNumber;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public double getBalance() {
        return balance;
    }

    //Methods
    public void putMoney(double money) {
        balance += money;
    }
    public boolean takeMoney(double money) {
        if (!(balance - money >= 0)) {
            return false;
        } else {
            balance -= money;
            return true;
        }
    }

    public String getCountInfo(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Count number: " + countNumber + " "  + "UserName: " + userName + "Balance : " + df.format(balance) + " $";
    }
}
