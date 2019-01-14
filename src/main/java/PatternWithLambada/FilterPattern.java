package PatternWithLambada;

import DataModel.Person;
import FunInterface.Criteria;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class FilterPattern {

    //reusing lambada may reduce duplicate code
    private static final Predicate<Person> lessThan12Years = person -> person.getAge() < 12;
    private static final Predicate<Person> biggerThan13 = person -> person.getAge() > 13;
    private static Person p1 = new Person("mike", 12);
    private static Person p2 = new Person("tom", 13);
    private static Person p3 = new Person("jerry", 16);
    private static List<Person> persons;

    private static Criteria<Person> criteriaBiggerThan12 = inputs ->
            inputs.stream().filter(x -> x.getAge() > 12).collect(toList());

    private static Criteria<Person> criteriaBiggerThan14 = inputs ->
            inputs.stream().filter(x -> x.getAge() > 14).collect(toList());

    static {
        persons = Stream.of(p1, p2, p3).collect(toList());
    }

    public static void main(String[] args) {
        //meetCriteria pattern maybe removed by using stream meetCriteria
        System.out.println("persons size : " + persons.size());

        //lambada makes a light-weight design possible; and drawing out some old techniques out of our bags.
        List<Person> lessThan12Persons = persons.stream().filter(lessThan12Years).collect(toList());
        System.out.println("less Than 12 Persons size : " + lessThan12Persons.size());

        //
        List<Person> biggerThan13Persons = persons.stream().filter(biggerThan13).collect(toList());
        System.out.println("bigger Than 13 Persons size : " + biggerThan13Persons.size());


        //if using self-define functional interface
        System.out.println("persons bigger than 12: " + criteriaBiggerThan12.meetCriteria(persons).size());
        System.out.println("persons bigger than 14:" + criteriaBiggerThan14.meetCriteria(persons).size());

    }
}
