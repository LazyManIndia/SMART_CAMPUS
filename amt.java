package com.company;

public class amt {
    int amount;
    Main m = new Main();
    welcome wc = new welcome();
    void amt(int amount){
        this.amount = amount;
        System.out.println("Amount is " + amount);
        System.out.println("--------Purchase finished--------");
        System.out.println("---------------------------------\n");

        wc.welcome();
    }

}
