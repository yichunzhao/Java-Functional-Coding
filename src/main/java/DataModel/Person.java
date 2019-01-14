package DataModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.stream.Stream;

/**
 * @author YNZ
 */

@Data
@Builder
@AllArgsConstructor
public final class Person {
    String name;
    int age;
    boolean employed;
    Gender gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Stream<Person> createTestPersons() {
        return Stream.of(
                Person.builder().age(16).employed(false).name("Tom").gender(Gender.MALE).build(),
                Person.builder().age(26).employed(true).name("Mia").gender(Gender.FEMALE).build(),
                Person.builder().age(36).employed(true).name("Mike").gender(Gender.MALE).build(),
                Person.builder().age(38).employed(true).name("Baldwin").gender(Gender.MALE).build(),
                Person.builder().age(30).employed(true).name("Alma").gender(Gender.FEMALE).build()
        );
    }

}
