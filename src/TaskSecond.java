import java.util.ArrayList;
import java.util.List;

public class TaskSecond {

    public static void main(String[] args) {

        //есть список родителей, отдайте список детей

        Person ivan = new Person("Иван");
        Person sergey = new Person("Сергей");
        List<Person> arturChildren = new ArrayList<>();
        arturChildren.add(ivan);
        arturChildren.add(sergey);
        Person artur = new Person("Артур", arturChildren);


        Person daniil = new Person("Даниил");
        List<Person> vladimirChildren = new ArrayList<>();
        vladimirChildren.add(daniil);
        Person vladimir = new Person("Владимир", vladimirChildren);


        Person anna = new Person("Анна");
        List<Person> alexanderChildren = new ArrayList<>();
        alexanderChildren.add(anna);
        Person alexander = new Person("Александр", alexanderChildren);


        Person anton = new Person("Антон");

        List<Person> people= new ArrayList<>();
        people.add(artur);
        people.add(vladimir);
        people.add(alexander);
        people.add(anton);

        System.out.println(people);

        List<Person> children =people.stream()
                .map(person->person.getChildren())
                .filter(childrenList->childrenList != null)
                .flatMap(childrenList->childrenList.stream())
//                .map(child->child.getName())
                .toList();

        System.out.println(children);

    }
}
