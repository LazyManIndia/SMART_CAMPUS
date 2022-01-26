package com.company;
import java.util.*;

public class Shop {
    Scanner sc = new Scanner(System.in);
    amt a1 = new amt();
    ArrayList<String> map = new ArrayList<>();
    int amount = 0;
    void Shop(){
        amt a1 = new amt();
        map.add("-->1. Long size note (260 pages)");
        map.add("-->2. Short size note (160 pages)");
        map.add("-->3. Blue pen");
        map.add("-->4. 5 Star");
        map.add("-->5. Pencil");
        map.add("-->6. Pizza");
        map.add("-->7. Lemon juice");
        map.add("-->8. Briyani");
        map.add("-->0. Exit");
    System.out.println("\n--------------------Select a card--------------------");
    for(String i : map){
        System.out.println(i);
    }
    System.out.println("Enter your choice : ");
    int a = sc.nextInt();
    int x=1;
    while(x==1) {
        System.out.println("Next choice");
        int choice = sc.nextInt();
        switch (choice){
            case 1: amount += 21;
            break;

            case 2: amount += 12;
            break;

            case 3: amount +=5;
            break;

            case 4: amount +=5;
            break;

            case 5: amount +=5;
            break;

            case 6: amount +=40;
            break;

            case 7: amount +=20;
            break;

            case 8: amount +=70;
            break;

            case 0: x=2;
            break;
        }
        }
    a1.amt(amount);
    }
}

/*

 */