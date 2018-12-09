package DataModel;

import lombok.Value;

/**
 * @author YNZ
 */

@Value
public final class Person implements Comparable<Person> {
    String name;
    int age;

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }
}
