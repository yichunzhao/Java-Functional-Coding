package ReduceCollection;

import DataModel.Person;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class MapFilterReduceOperation {

    //functional coding makes code concise.
    public static void main(String[] args) {

        List<Person> persons = Stream.of(
                new Person("peter", 34),
                new Person("mike", 45),
                new Person("mia", 28),
                new Person("julia", 28),
                new Person("jack", 30)).collect(Collectors.toList());

        long numOfAgeBiggerThan40 = persons.stream().mapToInt(Person::getAge).filter(Person::biggerEqual40).count();
        System.out.println("number of person older than 40 years old = " + numOfAgeBiggerThan40);

        long numOfAgeBiggerEqual30 = persons.stream().mapToInt(Person::getAge).filter(Person::biggerEqual30).count();
        System.out.println("number of person older than 40 years old = " + numOfAgeBiggerEqual30);


    }

}
