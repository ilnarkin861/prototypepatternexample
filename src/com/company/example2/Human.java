package com.company.example2;

public class Human implements Copyable {

    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public Object copy() {
        return new Human(name, age);
    }
}
