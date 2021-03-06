package ReduceCollection;

import java.util.stream.Stream;

import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.IntStream.of;

/**
 * @author YNZ
 */
public class ReduceCollectionToSingle {

    public static void main(String[] args) {
        int sum;

        //sum to a single result
        of(1, 2, 5, 6).sum();

        //reduce to a single result
        sum = Stream.of(12, 14, 45).reduce((a, b) -> a + b).get();
        System.out.println("sum = " + sum);

        //map applying a function on each element
        sum = of(12, 23, 455, 45).map(x -> x - 2).sum();
        System.out.println("sum = " + sum);

        //map to int stream; then may using sum method etc.
        Stream<String> wordStream = Stream.of("this is a sentence".split("\\s"));
        System.out.println("there are " + wordStream.count() + " words in this sentence.");
        Stream.of("this is a sentence".split("\\s")).mapToInt(String::length).forEach(System.out::println);

        int totalLetters = Stream.of("this is a sentence".split("\\s")).mapToInt(String::length).sum();
        System.out.println("total letters = " + totalLetters);

        int maxLength = Stream.of("this is a sentence".split("\\s")).mapToInt(String::length).max().getAsInt();
        System.out.println("max length word = " + maxLength);

        //The above can be simplified by using predefined collectors
        int maxLength_ = Stream.of("this is a sentence".split("\\s")).collect(summarizingInt(String::length)).getMax();
        System.out.println("max length word = " + maxLength_);

    }
}
