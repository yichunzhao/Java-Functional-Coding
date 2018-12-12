package primitivestream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class UsingPrimitiveStream {
    public static void main(String[] args) {
        //primitive stream making more efficient to handle primitives.
        int r = IntStream.of(1, 2, 3).sum();
        System.out.println(r);

        double s = DoubleStream.of(12.3, 34.3, 11.2).sum();
        System.out.println(s);

        Double average = DoubleStream.of(122, 334, 444).average().getAsDouble();
        System.out.println("average : = " + average);

        long distinctNum = LongStream.of(123, 445, 445, 556, 8776, 8776).distinct().count();
        System.out.println("distinct numbers : " + distinctNum);

        long first = LongStream.of(123, 445, 445, 556, 8776, 8776).findFirst().getAsLong();
        System.out.println("first : " + first);

        //range exclusive
        List<Integer> intRange = IntStream.range(1,5).boxed().collect(toList());
        System.out.println("int range: " + intRange);

        //range inclusive
        List<Integer> intRangeExclusive = IntStream.rangeClosed(1,5).boxed().collect(toList());
        System.out.println("int range exclusive:  " + intRangeExclusive);




    }

}
