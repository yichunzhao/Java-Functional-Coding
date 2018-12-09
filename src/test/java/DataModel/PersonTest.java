package DataModel;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author YNZ
 */
public class PersonTest {

    @Test
    public void whenOnePersonIsAnother_ThenItReturnZero() {
        Person p1 = new Person("mike", 36);
        Person p2 = new Person("mike", 38);
        int actual = p1.compareTo(p2);
        assertEquals(actual, 0);
    }

    @Test
    public void whenOnePersonIsNotAnother_LexicalLessThan_ThenItReturnLessThanZero() {
        Person p1 = new Person("mike", 36);
        Person p2 = new Person("tom", 38);
        int actual = p1.compareTo(p2);
        assertTrue(actual < 0);
    }

    @Test
    public void whenOnePersonIsNotAnother_LexicalBiggerThan_ThenItReturnsBiggerThanZero() {
        Person p1 = new Person("tony", 36);
        Person p2 = new Person("mike", 38);
        int actual = p1.compareTo(p2);
        assertTrue(actual > 0);
    }

    @Test
    public void whenTwoPerson_HavingSameNameDifferentAge_ThenItReturnFalse() {
        Person p1 = new Person("mike", 38);
        Person p2 = new Person("mike", 36);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void whenTwoPerson_HavingSameNameAndAge_ThenItReturnTrue() {
        Person p1 = new Person("mike", 38);
        Person p2 = new Person("mike", 38);
        assertTrue(p1.equals(p2));
    }

}