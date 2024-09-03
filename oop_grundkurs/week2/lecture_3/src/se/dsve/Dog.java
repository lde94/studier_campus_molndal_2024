package se.dsve;

public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark(){
        System.out.println("Bark bark bark!");
    }
}
