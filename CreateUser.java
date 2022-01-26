package com.company;
import java.util.*;


public class CreateUser {
    String name;
    String passWord;
    void CreateUser(){
        //Scanning object
        Scanner sc = new Scanner(System.in);

        //StoreUserNames object for checking is UserName available or not
        StoreUserNames sun = new StoreUserNames();

        System.out.print("\nCreate a UserName : ");
        String n = sc.nextLine();
        System.out.print("Enter a PassWord : ");
        String p = sc.nextLine();

        sun.Users(n, p);
    }
}
