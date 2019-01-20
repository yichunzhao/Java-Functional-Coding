package Streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author YNZ
 */
public class StreamFromArray {

    public static void main(String[] args) {
        //convert an int array into a stream; it gives a int stream
        int[] ages = {12, 5, 34, 78, 90};
        System.out.println(Arrays.stream(ages).sum());

        //convert an string array into a stream<string>
        String[] strings = {"whatever", "Nonlinear"};
        Stream<String> stringStream = Arrays.stream(strings);
        System.out.println(stringStream.count());

    }
}
