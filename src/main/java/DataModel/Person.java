package DataModel;

import lombok.Data;

/**
 * @author YNZ
 */

@Data
public final class Person {
    String name;
    int age;
    boolean employed;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static boolean biggerEqual40(int age) {
        return age >= 40;
    }

    public static boolean biggerEqual30(int age) {
        return age >= 30;
    }

}
