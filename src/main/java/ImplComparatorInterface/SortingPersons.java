package ImplComparatorInterface;

import DataModel.Person;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.of;

/**
 * @author YNZ
 */
public class SortingPersons {

    public static void main(String[] args) {

        Person p1 = new Person("mike", 27);
        Person p2 = new Person("emily", 37);
        Person p3 = new Person("jack", 17);

        //reusing Comparator lambada expressions
        Comparator<Person> comparingAscending = Comparator.comparing(Person::getName);
        Comparator<Person> compareAgeAscending = Comparator.comparing(Person::getAge);
        Comparator<Person> compareAgeDescending = Comparator.comparing(Person::getAge).reversed();

        //sorting by comparator interface by name
        List<Person> sortedPersons = of(p1, p2, p3).sorted(comparingAscending).collect(toList());
        System.out.println(sortedPersons);

        //sorting by comparator interface by age
        List<Person> sortedPersonsByAgeDec = of(p1, p2, p3).sorted(compareAgeDescending).collect(toList());
        System.out.println(sortedPersonsByAgeDec);

        //sorting by comparator interface by age
        List<Person> sortedPersonsByAgeAsc = of(p1, p2, p3).sorted(compareAgeAscending).collect(toList());
        System.out.println(sortedPersonsByAgeAsc);

        List<Person> sortedPersonsByAgeName = of(p1, p2, p3)
                .sorted(compareAgeAscending.thenComparing(comparingAscending)).collect(toList());
        System.out.println(sortedPersonsByAgeName);

        //stream min accept a comparator lambada; taking the minimum value from sorted elements
        Person youngestPerson = of(p1, p2, p3).min(compareAgeAscending).get();
        System.out.println("Youngest person: " + youngestPerson);

        //stream max accept a comparator lambada; taking the max. value from sorted elements
        Person oldestPerson = of(p1, p2, p3).max(compareAgeAscending).get();
        System.out.println("Oldest person: " + oldestPerson);

    }
}
