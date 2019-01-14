package CollectingData;

import DataModel.Gender;
import DataModel.Person;

import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author YNZ
 */
public class GroupingPersons {
    //how to group persons fx: according to gender

    public static void main(String[] args) {
        Map<Gender, Long> genderCounting = Person.createTestPersons().collect(groupingBy(Person::getGender, counting()));
        System.out.println(genderCounting);
    }
}
