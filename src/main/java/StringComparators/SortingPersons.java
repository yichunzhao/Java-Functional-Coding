package StringComparators;

import DataModel.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class SortingPersons {

    public static void main(String[] args) {

        Person p1 = new Person("mike", 27);
        Person p2 = new Person("emily", 37);
        Person p3 = new Person("jack", 17);

        List<Person> sortedPersons =  Stream.of(p1, p2, p3).sorted(Comparator.comparing(Person::getName)).collect(toList());
        System.out.println(sortedPersons);


    }
}
