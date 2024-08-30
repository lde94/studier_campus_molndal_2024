import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        //Grunder
        //Uppgift 1.1

        int age = 30;
        double height = 1.75;
        char initial = 'A';
        String name = "Alice";
        boolean isStudent = true;

        //Uppgift 1.2
        System.out.println("Variabeln age har värdet "+age +"och är av typen "+((Object) age).getClass().getName());
        System.out.println("Variabeln height har värdet "+height +" och är av typen "+((Object) height).getClass().getName());
        System.out.println("Variabeln initial har symbolen "+initial +" och är av typen "+((Object) initial).getClass().getName());
        System.out.println("Variabeln name har namnet "+name +" och är av typen "+((Object) name).getClass().getName());
        System.out.println("Variabeln isStudent har värdet "+isStudent +" och är av typen "+((Object) isStudent).getClass().getName());

        //Uppgift 2.1

        int sum = 10 + 20;
        System.out.println(sum);
        int difference = 100 - 30;
        System.out.println(difference);
        int product = 5 * 7;
        System.out.println(product);
        int quota = 20 / 4;
        System.out.println(quota);
        int rest = 10 % 3;
        System.out.println(rest);
//-----------------------------------------------------------------------------
        //Villkors-satser
        //uppgift 1.1
        int num = 11;
        if((num & 2) == 0){
            System.out.println("Talet är jämnt!");
        } else {
            System.out.println("Talet är udda");
        }

        //Uppgift 1.2
        age = 120;

        if (age < 18) {
            System.out.println("minderårig");
        }
        else if (age >= 18 && age <= 64) {
            System.out.println("vuxen");
        }
        else if (age >= 65) {
            System.out.println("senior");
        }

        //uppgift 1.3
        int a = 20, b = 17, c = 12;

        if (a > b && a > c){
            System.out.println("a är störst");
        }
        else if (b > a && b > c){
            System.out.println("b är störst");
        }
        else if (c > a && c > b){
            System.out.println("c är störst");
        }

        //uppgift 2.1
        int month = 3;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        default:
            System.out.println("Error");
        }

        //Repitition av Loopar
        //Uppgift 1.1

        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }

        }

        //Uppgift 1.2
        sum = 0;
        for (int i = 1; i <=100 ; i++) {
            sum += i;

        }
        System.out.println(sum);

        //uppgift 1.3
        int multiply = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose a number: ");
        int number = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " times " + i + " equals " + number * i);
        }

        //Uppgift 2.1
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

        //Uppgift 2.2




    }
}
