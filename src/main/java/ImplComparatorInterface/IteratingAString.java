package ImplComparatorInterface;

/**
 * @author YNZ
 */
public class IteratingAString {

    public static void main(String[] args) {
        String str = "I love java 8 style";
        str.chars().mapToObj(ch -> Character.valueOf((char) ch)).forEach(System.out::println);

        //Query
        long digitNum = str.chars().filter(Character::isDigit).count();
        System.out.println("digits in the sentence: " + digitNum);

        //
        long charANum = str.chars().filter(ch -> ch == 'a').count();
        System.out.println("it contains 'a' : " + charANum);

        //iterating each char in a string and print it
        str.chars().forEach(IteratingAString::printChar);
        System.out.println();

        //removing specific char in a string.
        String newStr = str.replace('a','A');
        System.out.println(newStr);

    }

    public static void printChar(int ch) {
        System.out.print((char) ch);
    }
}
