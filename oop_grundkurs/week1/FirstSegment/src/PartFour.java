class Car {
    String color;
    int speed;

    void accelerate() {
       // speed = speed + 10;
        speed += 10;
    }
}

public class PartFour {
    public static void main(String[] args) {
        System.out.println("Klasser");
        Car myCar = new Car();
        myCar.color = "red";
        System.out.println(myCar.color);

        Car car = new Car();
        System.out.println(car.color);
        car.color = "white";
        System.out.println(car.color);
        System.out.println(myCar.speed);
        myCar.accelerate();
        System.out.println(myCar.color);
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        System.out.println(myCar.speed);
        System.out.println(car.speed);

    }
}
