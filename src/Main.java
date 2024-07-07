import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //есть список и

        Person vladimir = new Person("Vladimir");
        Person artur = new Person("Artur");
        Person alexandr = new Person("Alexandr");
        Person anton = new Person("Anton");
        Person daniil = new Person("Daniil");

        Book book1 = new Book("Zorro", vladimir);
        Book book2 = new Book("Voina", artur);
        Book book3 = new Book("Mir", alexandr);
        Book book4 = new Book("Ritm", anton);
        Book book5 = new Book("Dance", daniil);
        Book book6 = new Book("Cat", null);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        List<String> people = books.stream()
                .map(book -> book.getRentedBy())
                .filter(person -> person != null)
                .filter(person -> person.getName() != null)
                .filter(person -> person.getName().startsWith("A"))
                .map(person -> person.getName())
                .toList();
        System.out.println(people);


    }
}
