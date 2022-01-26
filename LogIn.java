package com.company;

import java.util.*;


public class LogIn{
    String userName;
    String passWord;
    void LogIn(){
        Scanner sc = new Scanner(System.in);
        StoreUserNames sun = new StoreUserNames();

        //Creating_Profile
        System.out.print("\nCreate a User Name : ");
        String un = sc.nextLine();

        System.out.print("Create a Password : ");
        String pw = sc.nextLine();

        sun.StoreUserNames(un, pw);
    }
}
