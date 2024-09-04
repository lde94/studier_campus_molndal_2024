package se.dsve;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sameInfo(Person person) {
        // '==' jämför om 2 referenser pekar till samma sak, 'equals()' jämför innehåll
        if (this.age == person.age) {
            System.out.println("They have the same age.");
        } else {
            System.out.println("They have different ages.");
        }

        if (this.name.equals(person.name)) {
            System.out.println("They have the same name.");
        } else {
            System.out.println("They have different names.");
        }

    }
}
