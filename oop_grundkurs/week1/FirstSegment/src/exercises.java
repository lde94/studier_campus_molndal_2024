public class exercises {
    public static void main(String[] args) {
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

    }
}
