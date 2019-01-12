package DuplicateInLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class LexicalScopeInLambda {
    //name need to check
    private static final List<String> friends =
            Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

    //Duplicate Lambda
//    private static Predicate<String> startsWithN = name -> name.startsWith("N");
//    private static Predicate<String> startsWithM = name -> name.startsWith("M");

    //Can be removed by introducing a scope parameter 'letter', lexical scoping.
    private static Predicate<String> checkIfStartWith(String letter) {
        return name -> name.startsWith(letter);
    }

    public static void main(String[] args) {
        System.out.println(friends.stream().filter(checkIfStartWith("M")).collect(toList()));
        System.out.println(friends.stream().filter(checkIfStartWith("N")).collect(toList()));
    }
}
