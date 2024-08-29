public class PartTwo {
    public static void main(String[] args) {
        System.out.println("IF-then");

        if(true){
            System.out.println("If-sats");
        }

        System.out.println("If-Else");

        int number = 8;
        if(number == 9){
            System.out.println("number är = 9");
        } else {
            System.out.println("number är != 9");
        }

        System.out.println("GreaterThen");
        if(number >= 9){
            System.out.println("number är >= 9");
        } else {
            System.out.println("number är < 9");
        }

        int age = 18;
        if(age >= 18){
            System.out.println("Personen är myndig");
        } else {

            System.out.println("Personen är INTE myndig");
        }

        System.out.println("else if");
        number = 0;
        if(number > 0){
            System.out.println("Talet är positivt");
        } else if (number < 0) {
            System.out.println("Talet är negativt");
        } else {
            System.out.println("Talet är noll");
        }

        System.out.println("----------------");

        System.out.println("Switch-state");

        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
        System.out.println("Fortsätter här");

    }
}
