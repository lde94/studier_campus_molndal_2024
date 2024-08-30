import java.util.Scanner;

public class PartThree {
    public static void main(String[] args) {
        System.out.println("Part Three");
        System.out.println("For-Loop");

        for (int i = 0; i <= 5; i++) {
            System.out.println("Index: " + i);
        }

        for (int i = 5; i >= 0; i--) {
            System.out.println("Index: " + i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Index: " + i);
        }

        System.out.println("While-loop");

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        i = 5;
        while (i > 0){
            System.out.println(i);
            i--;
        }

        i = 0;
        while (i <= 6) {
            System.out.println(i);
            i+=2;
        }

        System.out.println("Do-While-loop");

        i = 0;
        do {
            System.out.println("Värdet av i = " + i);
            i++;
        } while (i < 5);

        i = 10;
        do {
            System.out.println("Värdet av i = " + i);
            i--;
        } while (i > 0);

        System.out.println("Scanner");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett heltal: ");
        int number = scanner.nextInt();
        System.out.println("Du angav: " + number);
        scanner.close();

    }
}
