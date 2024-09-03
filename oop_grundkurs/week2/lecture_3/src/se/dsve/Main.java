package se.dsve;


public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        //Car Part
        /*Car car1 = new Car();
        car1.startEngine();
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        car1.brand = "Volvo";
        car1.model = "v90";
        car1.year = 2024;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);

        car1.brand = "Tesla";
        System.out.println(car1.brand);

        car1.accelerate();
        car1.accelerate();

        CarConstr car2 = new CarConstr("Mazda", "323", 1994);
        car2.carInfo();
        CarConstr car3 = new CarConstr("Nissan", "Micra");
        car3.carInfo();

        CarConstr car4 = new CarConstr();
        car4.carInfo();*/


        //Dog Part
        /*Dog doggo = new Dog("Teddy", 3);
        Dog doggoRef = doggo;

        System.out.println(doggoRef.age + " " + doggoRef.name);

        doggoRef.name = "Todd";
        System.out.println(doggo.age + " " + doggo.name);
        doggo.bark();*/


        //House Part
        /*House house = new House();
        house.color = "red";
        house.adress = "Yep street 22";
        System.out.println(house.color + " " + house.adress);

        Painter painter = new Painter();
        painter.paint(house);
        System.out.println(house.color + " " + house.adress);*/

        //Library part
        Library lib = new Library();
        Book book = (lib.getBook("Lord of the Rings"));
        System.out.println(book.title);





    }
}