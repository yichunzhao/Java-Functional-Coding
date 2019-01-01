package Streams;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class InfiniteStream {

    public static void main(String[] args) {
        //iterate return infinite stream; unary function T=F(T)
        //intermediate operation: limit()
        //terminal operation: collect. stream cannot be used anymore.
        List<Integer> list = Stream.iterate(0, (x) -> x + 2).limit(10).collect(toList());
        System.out.println(list);

        //skip the first 10 element in the stream
        List<Integer> listSkipped = Stream.iterate(0, (x) -> x + 2).skip(10).limit(10).collect(toList());
        System.out.println(listSkipped);
    }
}
