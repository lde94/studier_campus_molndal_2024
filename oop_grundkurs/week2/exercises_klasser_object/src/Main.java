//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Book Class
        Book lotr = new Book();
        lotr.title =  "Lord of the Rings";
        lotr.author = "J. R. R. Tolkien";
        lotr.pages = 532;
        lotr.genre = "Fantasy";

        lotr.checkGenre("fantasy");

        /*lotr.bookInfo();
        lotr.howLong(5);

        Book hobbit = new Book();
        hobbit.title =  "Hobbit";
        hobbit.author = "Tolkien";
        hobbit.pages = 470;
        hobbit.bookInfo();
        hobbit.howLong(10);*/


        /*Person person1 = new Person("Göran", 29, "goran@gmail.com");
        person1.personInfo();

        Person person2 = new Person("Jenny", 17);
        person2.personInfo();

        Person person3 = new Person();
        person3.personInfo();*/



    }
}