package PatternWithLambada;

import DataModel.Person;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class FilterPattern {

    private static Person p1 = new Person("mike", 12);
    private static Person p2 = new Person("tom", 13);
    private static Person p3 = new Person("jerry", 16);

    private static List<Person> persons;

    static {
        persons = Stream.of(p1, p2, p3).collect(toList());

    }

    public static void main(String[] args) {

        System.out.println("persons size : " + persons.size());

        List<Person> lessThan12Persons = persons.stream().filter(p -> p.getAge() < 12).collect(toList());
        System.out.println("less Than 12 Persons size : " + lessThan12Persons.size());

        List<Person> biggerThan13Persons = persons.stream().filter(p->p.getAge()>13).collect(toList());
        System.out.println("bigger Than 13 Persons size : " + biggerThan13Persons.size());


    }
}
