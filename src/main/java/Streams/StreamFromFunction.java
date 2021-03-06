package Streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class StreamFromFunction {

    //it may generate stream from a function

    public static void main(String[] args) {
        //iterate return infinite stream; unary function T=F(T)
        //intermediate operation: limit()
        //terminal operation: collect. stream cannot be used anymore.
        List<Integer> list = Stream.iterate(0, (x) -> x + 2).limit(10).collect(toList());
        System.out.println(list);

        //skip the first 10 element in the stream
        List<Integer> listSkipped = Stream.iterate(0, (x) -> x + 2).skip(10).limit(10).collect(toList());
        System.out.println(listSkipped);

        //stream generation using a supplier function ()-> x+2
        List<Double> doubles = Stream.generate(() -> new Random().nextDouble()).limit(10).collect(toList());
        System.out.println(doubles);

        //all match is a terminal operation of a stream.
        //using a predicate function.
        Boolean allBiggerThanOne = Stream.generate(() -> BigDecimal.valueOf(2L))
                .limit(10).allMatch(x -> x.compareTo(BigDecimal.ONE) == 1);
        System.out.println(allBiggerThanOne);

        System.out.println(Stream.generate(Math::random).limit(30).collect(toList()));
        System.out.println(Stream.iterate(0, (x) -> x + 2).skip(3).limit(5).collect(toList()));

    }
}
