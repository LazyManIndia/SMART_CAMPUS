package com.company;
import java.util.*;


public class welcome {
    void welcome() {

        Scanner sc = new Scanner(System.in);
        CreateUser cu = new CreateUser();
        LogIn li = new LogIn();

        //UserInputs
        System.out.print("1.Login \n2.New user \nSelect the option(1/2) : ");
        int option = sc.nextInt();

        //UserChecking
        if (option == 1) {
            cu.CreateUser();
        } else {
            li.LogIn();
        }
    }
}
