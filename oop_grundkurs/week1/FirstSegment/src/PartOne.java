public class PartOne {
    public static void main(String[] args) {
        System.out.println("Variabler och datatyper");
        System.out.println("Hello World");

        String hello = "Hello World 2";
        System.out.println(hello);

        int age = 23;
        System.out.println(age);

        double pi = 3.141593;
        System.out.println(pi);

        char grade = 'G';
        System.out.println(grade);

        boolean isStudent = true;
        System.out.println(isStudent);

        System.out.println("-----------------------------");
        System.out.println("Operatorer och uttryck");

        // + (addition): lägger ihop tal
        // - (subtraktion): Drar bort ett tal från ett annat
        // * (multiplikation): Multiplicerar två tal
        // / (division): Dividerar ett tal med ett annat



        System.out.println(4+5);
        System.out.println(4-5);
        System.out.println(4*5);
        System.out.println(4/5);
        System.out.println(5%4);

        int sum = 4 + 5;
        System.out.println(sum);

        System.out.println("Jämsförelse operatorer");
        // == (lika med): kontrollerar om två värden är lika
        // != (inte lika med): kontrollerar om två värden inte är lika
        // > (större än): kontrollerar om ett värde är större än ett annat
        // < (mindre än): kontrollerar om ett värde är mindre än ett annat


        boolean isEqual = (5 ==5); //true
        boolean isEqual2 = (4 == 5); //false
        boolean isNotEqual = (5 != 4); //true
        boolean isGreater = (5 > 3); //true
        boolean isLesser = (3 < 5);//true
        boolean isGreaterOrEqual = (5 >= 5); //true
        boolean isLesserOrEqual = (3 <= 5); //true

        System.out.println("------------------");
        System.out.println("Logiska operatorer");

        // && (AND): Sant om båda uttrycken är sanna
        // || (OR): Sant om minst ett av uttrycken är sant. uttalas "Pipe"
        // ! (NOT): Vänder ett sant uttryck till ett falskt och vise versa.

        if (true && true){
            System.out.println(true);
        }

        if (true && false){
            System.out.println(true);
        }

        if (true && !false){
            System.out.println(true);
        }

        if (false && false){
            System.out.println(false);
        }

        if (false && !false){
            System.out.println(true);
        }

        if (!false && !false){
            System.out.println(!false);
        }

        System.out.println("OR");
        if(true || true){
            System.out.println(true);
        }

        if(true || false){
            System.out.println(true);
        }

        if(false || true){
            System.out.println(true);
        }

        if(false || false){
            System.out.println(true);
        }

        if(false || !false){
            System.out.println(true);
        }
        System.out.println("NOT");
        System.out.println(true);
        System.out.println(!true);
        System.out.println(false);
        System.out.println(!false);

        System.out.println("---------------------");
        System.out.println("Uttryck");

        boolean andResult = 5 > 3 && 8 > 6;
       // boolean andResult = (5 > 3) && (8 > 6);
       // boolean andResult = ((5 > 3) && (8 > 6));
       // boolean andResult = if((5 > 3) && (8 > 6) && (false)) {};

        System.out.println(andResult);

        boolean orResult = (5 > 3) || (8 > 6);
        System.out.println(orResult);

        boolean notResult = !(5 > 3);
        System.out.println(notResult);

        System.out.println("Prioritering");
       // int result = 10 + (5 * 2);
        int result = (10 + 5) * 2;
        System.out.println(result);


    }
}
