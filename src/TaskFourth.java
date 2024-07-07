import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TaskFourth {


        public static void main(String[] args) {
            Person daniil = new Person("Даниил");
            Person artur = new Person("Артур");
            Person vladimir = new Person("Владимир");
            Person alexander = new Person("Александр");
            Person anton = new Person("Антон");

            Book book1 = new Book("Преступление и наказание", daniil);
            Book book2 = new Book("Дубровский", artur);
            Book book3 = new Book("Отцы и дети", vladimir);
            Book book4 = new Book("Евгений Онегин", alexander);
            Book book5 = new Book("Война и Мир", anton);
            Book book6 = new Book("Пиковая дама", daniil);

            //из списка книг создать мапу, в которой ключ - название книги, а значение - человек, который ее читает

            List<Book> books = new ArrayList<>();
            books.add(book1);
            books.add(book2);
            books.add(book3);
            books.add(book4);
            books.add(book5);
            books.add(book6);

            Map<String, String> map = books.stream()
                    //.collect(Collectors.toList())
                    .collect(Collectors.toMap(b -> b.getName(), b -> b.getRentedBy().getName()));

            System.out.println(map);

            String name = map.get("Война и Мир");
            System.out.println(name);











//        Person vladimir = new Person("Vladimir");
//        Person artur = new Person("Artur");
//        Person alexandr = new Person("Alexandr");
//        Person anton = new Person("Anton");
//        Person daniil = new Person("Daniil");
//
//        Book book1 = new Book("Zorro", vladimir);
//        Book book2 = new Book("Voina", artur);
//        Book book3 = new Book("Mir", alexandr);
//        Book book4 = new Book("Ritm", anton);
//        Book book5 = new Book("Dance", daniil);
//        Book book6 = new Book("Cat", artur);
//
//        List<Book> books = new ArrayList<>();
//        books.add(book1);
//        books.add(book2);
//        books.add(book3);
//        books.add(book4);
//        books.add(book5);
//        books.add(book6);
//
//        Map<String,String> map=books.stream()
//                .collect(Collectors.toMap(b->b.getName(),b->b.));
//
//        System.out.println(map);

    }
}