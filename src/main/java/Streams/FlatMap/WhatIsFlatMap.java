package Streams.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author YNZ
 */
public class WhatIsFlatMap {

    public static void main(String[] args) {
        //
        List<String> listString = getStringStream().collect(toList());
        System.out.println(listString);

        //map: transform on each single element
        List<String> listStrCapital = getStringStream().map(s -> s.toUpperCase()).collect(toList());
        System.out.println(listStrCapital);


        //flat map: flatten a stream of stream of elements in to one single stream.
        //reduce stream<stream<string>> into stream<string>
        List<String> strs = getStringStream().map(s -> s.split("")).flatMap(Arrays::stream).collect(toList());
        System.out.println(strs.size());
        System.out.println(strs);
    }

    public static Stream<String> getStringStream() {
        return Stream.of("head", "first", "design", "patterns");
    }
}
