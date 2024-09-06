package se.dsve;

public class Car {
    private String brand;
    private String model;
    private int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    Car() {
        this("Unknown","unknown",0);
    }

    public void displayInfo() {
        System.out.print("Brand: " + brand + " Model: " + model + " Year: " + year + "\n ");
    }
}
