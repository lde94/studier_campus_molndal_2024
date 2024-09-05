package se.dsve.model;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("", 0);
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Age less than 1.");
        }
    }
}
