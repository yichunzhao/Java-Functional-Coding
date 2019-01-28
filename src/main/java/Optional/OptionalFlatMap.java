package Optional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class OptionalFlatMap {

    public static void main(String[] args) {

        List<Integer> nums = getStrings().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(nums);

        long totalLength = getStrings().mapToInt(s->s.length()).sum();
        System.out.println(totalLength);






    }

    public static Stream<String> getStrings(){
        return  Stream.of("this", "is", "a", "book");
    }
}
