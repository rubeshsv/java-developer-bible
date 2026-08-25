package com.rubeshsv.bible.month1.week2.day4;

/*
Interview relevance: the classic "model a real-world thing as a class" question — the entry point to every OOP interview.
Setup: new class Dog (package your choice — e.g. ...week3.day1 or whatever fits your numbering).
What to build:
   1. A Dog class with two fields: String name; and int age;. //
   2. One method void bark() that prints <name> says Woof! (use the object's name field).
   3. A second class (or a main in Dog) that:
        creates two Dog objects with new,
        sets each one's name and age,
        calls bark() on each,
        prints each dog's age (e.g. Buddy is 3 years old).
 */

public class Dog {
    String name;
    int age;
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name="Buddy";
        dog1.age=2;
        dog1.bark();
        System.out.println(dog1.name+" is "+dog1.age+" years old");
        dog2.name="Max";
        dog2.age=3;
        dog2.bark();
        System.out.println(dog2.name+" is "+dog2.age+" years old");
    }
    //One method void bark() that prints <name> says Woof!
    void bark () {
        System.out.println(name+" Says Woof! ");
    }
}

