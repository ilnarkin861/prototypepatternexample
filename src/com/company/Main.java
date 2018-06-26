package com.company;

import com.company.example1.Human;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human human1 = new Human("Vasya", 20);
        Human newHuman1 = (Human) human1.clone();
        newHuman1.name = "Vika";
        System.out.println(human1.name);
        System.out.println(newHuman1.name);

        // Interface Copyable
        com.company.example2.Human human2 = new com.company.example2.Human("Petya", 25);
        com.company.example2.Human newHuman2 = (com.company.example2.Human) human2.copy();
        newHuman2.name = "Irina";
        System.out.println(human2.name);
        System.out.println(newHuman2.name);


    }
}
