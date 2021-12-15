package com.core.program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTest {
    public static void main(String[] args) {
        /* <Integer> list = Stream.of(2,3,5).forEach(System.out::println).collect(Collectors.toList());
        System.out.println(list.size());  */

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);
       /* Object obj = ()->{
            System.out.println("Trickey Camel");
        };*/
    }
}
