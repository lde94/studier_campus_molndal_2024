package se.dsve;

import se.dsve.banan.ExampleClass;
import se.dsve.model.Person;
import sw.Helper;
import sw.Podracer;
import sw.Race;


import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hej Lars");



        int lul = addTwoNumbers(3,7);
        System.out.println(lul);

        //bankDemo();
        /*account.balance = 1000;
        System.out.println(account.balance);
        account.balance -= 10000;
        System.out.println(account.balance);*/

        ExampleClass exampleClass = new ExampleClass();
        //exampleDemo();
        //personDemo();

        //4.md
        //uppgift 1
        /*EvenNumbers nums = new EvenNumbers();
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);  // Exempel på en lista med heltal
        List<Integer> evenNumbers = nums.filterEvenNumbers(numbers); // Anropa metoden
        System.out.println(evenNumbers);  // Skriv ut de jämna talen*/

        //5.md
        //Uppgift 1
        /*int arr1[] = {2,2,3,5};
        int sum;

        sum = sumArray(arr1, arr1.length);
        System.out.println(sum);*/

        /*recursion();*/

        System.out.println(Helper.randomInt());
        racing();


    }

    private static int sumArray(int arr[], int index) {
        if (index < 0){
            return 0;
        } else {
            return arr[index] + sumArray(arr, index - 1);
        }

    }

    private static void recursion(){
        System.out.println("Recursion.");
        System.out.println("n = 5 => 5! => 5*4*3*2*1 returnerar av operationen = 120");
        System.out.println("factorial(0): " + factorial(0));
        System.out.println("factorial(1): " + factorial(1));
        System.out.println("factorial(2): " + factorial(2));
        System.out.println("factorial(3): " + factorial(3));
        System.out.println("factorial(4): " + factorial(4));
        System.out.println("factorial(5): " + factorial(5));
    }

    private static int factorial(int n ){
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }

    }

    private static void personDemo() {
        System.out.println("PersonDemo");
        Person person = new Person();
        person.setName("Nils");
        person.setAge(0);
        person.setAge(1);
        person.displayInfo();
        Person person1 = new Person("Anna", 5);
        person1.displayInfo();
        person1.setAge(10);
        person1.displayInfo();

    }

    private static void exampleDemo() {
        ExampleClass exampleClass = new ExampleClass();
        //System.out.println(exampleClass.packageNum);
        //System.out.println(exampleClass.protectedVar);
        System.out.println(exampleClass.getClass());
        System.out.println(exampleClass.getPrivateNumber());
    }

    private static void bankDemo() {
        BankAccount account = new BankAccount();
        account.getBalance();
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(500);
        account.withdraw(500);
        account.getBalance();
    }

    // addera två tal
    public static int addTwoNumbers(int num1, int num2){
        return num1 + num2;

    }

    private static void racing() {
        //Adds podracers
        Podracer anakin = new Podracer("Anakin Skywalker", 300, 100);
        Podracer sebulba = new Podracer("Sebulba", 200, 100);

        //Adds race
        Race race = new Race(anakin, sebulba);
        race.startRace();

    }
}

