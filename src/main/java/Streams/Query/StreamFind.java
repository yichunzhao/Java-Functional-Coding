package Streams.Query;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class StreamFind {

    public static void main(String[] args) {
        generateStream().findFirst().ifPresent(x -> System.out.println(x));

        //find first element in the stream, return an optional
        integerStream().findFirst().ifPresent(System.out::println);

        //find
        Optional<Integer> any = integerStream().findAny();
        System.out.println(any);

        //all match: return boolean
        System.out.println(integerStream().allMatch(x -> x > 35));

        //none match: return boolean
        System.out.println(integerStream().noneMatch(x -> x < 0));

    }

    public static Stream<Integer> generateStream() {
        return Stream.iterate(0, x -> x + 2).limit(10);
    }

    public static Stream<Integer> integerStream() {
        return Stream.of(12, 34, 45, 78, 99, 120);
    }

}
