package com.company;
import java.util.*;


public class StoreUserNames {
    String name;
    String password;
    HashMap<String, String> sun = new HashMap<>();
    Shop s = new Shop();
    void StoreUserNames (String userName, String passWord){
        this.name = userName;
        this.password = passWord;

        if (sun.size() == 0) {
            sun.put(name, password);
            s.Shop();
        } else {
            for (String i : sun.keySet()) {
                if (i == this.name) {
                    System.out.println("The user Name is already taken.... You try it another  ");
                }else{
                    sun.put(name, password);
                    s.Shop();
                }
                }
            }
       }

    void Users(String un, String pw){
            this.name = un;
            this.password = pw;
            for(String i : sun.keySet()){
                if(i.equals(name) && (sun.values()).equals(password)){
                        s.Shop();
                    }else{
                    System.out.println("Invaild user name or password");
                }
                }
            }
    }