package DataModel;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author YNZ
 */

@Setter
@Getter
@EqualsAndHashCode
@ToString
public final class Person implements Comparable<Person> {
    final private String name;
    final private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
}
