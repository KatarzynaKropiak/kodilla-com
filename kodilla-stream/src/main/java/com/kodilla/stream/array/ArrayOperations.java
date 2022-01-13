package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        IntStream.range(1, numbers.length+1)
                .forEach(System.out::println);

       double average = IntStream.range(1, numbers.length+1)
                .average()
                .orElse(-1);
       return average;
    }
}
