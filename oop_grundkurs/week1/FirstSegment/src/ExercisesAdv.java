import java.util.Scanner;

public class ExercisesAdv {
    public static void main(String[] args) {
        //Uppgift 1.1
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the title of the book: ");
        String title = scanner.nextLine();
        System.out.print("Please enter the author: ");
        String author = scanner.nextLine();
        System.out.print("Please enter the amount of pages: ");
        int pages = scanner.nextInt();
        System.out.print("Please enter the price of the book: ");
        double price = scanner.nextDouble();
        boolean isBound = false;
        boolean loopCheck = false;

        while (!loopCheck) {
            System.out.print("Is the book bound? (Y/N): ");
            if (scanner.next().equalsIgnoreCase("Y")) {
                isBound = true;
                loopCheck = true;
            }
            else if (scanner.next().equalsIgnoreCase("N")) {
                isBound = false;
                loopCheck = true;
            }
            else {
                System.out.println("Please enter a valid option.");
            }
        }
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Price: " + price);
        System.out.println("The book is bound?: " + isBound);
        scanner.close();*/

        //Uppgift 1.2
        /*System.out.print("Please enter the size(cm) of the short sides: ");
        Scanner scanner = new Scanner(System.in);
        double shortSides = scanner.nextDouble();
        System.out.print("Please enter the length of the long sides: ");
        double longSides = scanner.nextDouble();
        double circumference = (shortSides * 2) + (longSides * 2);
        System.out.println("The circumference is " + circumference + " cm");
        double area = shortSides*longSides;
        System.out.println("The area is " + area + " cm2");
        scanner.close();*/


        /*System.out.print("Please enter the degrees in celsius: ");
        Scanner scanner = new Scanner(System.in);
        double degreesCelsius = scanner.nextDouble();
        double degreesFahrenheit = (degreesCelsius * 1.8) + 32;
        System.out.println("The degrees in Fahrenheit: " + degreesFahrenheit);
        scanner.close();*/


        /*System.out.print("Please enter an amount of seconds: ");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        int secondsLeft = seconds % 60;
        System.out.println("The time converted is " + minutes + " minutes and " + secondsLeft + " seconds.");
        scanner.close();*/

        //Uppgift 1.3
        /*System.out.print("Please enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.print("Please enter your monthly income(SEK): ");
        double monthlyIncome = scanner.nextDouble();
        System.out.print("Please enter your credit score: ");
        double creditScore = scanner.nextDouble();
        boolean canGetLoan = false;

        if(age >= 18) {
            System.out.println("Age requirement met!");
        }
        else if(age < 18) {
            System.out.println("Age requirement not met!");
        }

        if (monthlyIncome >= 20000) {
            System.out.println("Monthly income requirement met!");
        }
        else if (monthlyIncome < 20000) {
            System.out.println("Monthly income not met!");
        }

        if(creditScore >= 700) {
            System.out.println("Credit score requirement met!");
        }
        else if (creditScore < 700) {
            System.out.println("Credit score not met!");
        }

        if(age >= 18 && monthlyIncome >= 20000 && creditScore >= 700) {
            canGetLoan = true;
            System.out.println("You are eligible for loan!");
        }
        else {
            System.out.println("You are not eligible for loan.");
        }
        scanner.close();*/

        //Uppgift 2.1

        /*System.out.println("Please enter your amount of points: ");
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();

        if (points >= 90) {
            System.out.println("You got an A grade!");
        }
        else if (points >= 80 && points < 90) {
            System.out.println("You got an B grade!");
        }
        else if (points >= 70 && points < 80) {
            System.out.println("You got an C grade!");
        }
        else if (points >= 60 && points < 70) {
            System.out.println("You got an D grade!");
        }
        else if (points >= 50 && points < 60) {
            System.out.println("You got an E grade!");
        }
        else if (points < 50) {
            System.out.println("You got an F grade :(");
        }
        else {
            System.out.println("Please insert the proper amount.");
        }
        scanner.close();*/

        /*System.out.print("Please enter the year to check if it´s a leap year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("It is a leap year.");
        }
        else {
            System.out.println("It is not a leap year.");
        }
        scanner.close();*/


        //Uppgift 2.2
        /*System.out.print("Please enter the weekday you´d like to know your schedule for: ");
        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.nextLine();

        switch (weekday) {
            case "Monday": {
                System.out.println("Homework and grocery shopping");
                break;
            }
            case "Tuesday": {
                System.out.println("Lecture");
                break;
            }
            case "Wednesday": {
                System.out.println("Homework and gym");
                break;
            }
            case "Thursday": {
                System.out.println("Lecture");
                break;
            }
            case "Friday": {
                System.out.println("Lecture");
                break;
            }
            case "Saturday": {
                System.out.println("Gym");
                break;
            }
            case "Sunday": {
                System.out.println("Free time!");
                break;
            }
            default: {
                System.out.println("Invalid weekday");
                break;
            }
        }
        scanner.close();*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter the second number: ");
        double b = scanner.nextDouble();
        System.out.println("Now choose between the following: *, +, -, /");
        String operator = scanner.next();

        switch (operator) {
            case "+": {
                System.out.println(a + b);
                break;
            }
            case "-": {
                System.out.println(a - b);
                break;
            }
            case "*": {
                System.out.println(a * b);
            }
            case "/": {
                System.out.println(a / b);
                break;
            }
            default: {
                System.out.println("Invalid operator");
            }
        }
        scanner.close();*/

        //Uppgift 3.1

        /*for (int i = 100; i > 0; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }

        }*/

        System.out.print("Please enter the faculty number: ");
        Scanner scanner = new Scanner(System.in);
        int facultyNumber = scanner.nextInt();

        for (int i = 1; i < facultyNumber; i++) {

            if(i > 0 && i % 2 == 0) {

                System.out.println(i);
            }

        }
        scanner.close();





    }


}
