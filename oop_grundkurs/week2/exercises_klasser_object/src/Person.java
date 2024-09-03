public class Person {
    String name;
    int age;
    String email;

   public Person (String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person (String name, int age) {
       this(name, age, "blank");
    }

    public Person (){
       this("unknown", 0, "unknown");

    }

    void personInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Email: " + email);
    }
}
