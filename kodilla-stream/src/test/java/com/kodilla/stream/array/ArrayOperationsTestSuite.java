package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        int numbers [] = new int[20];
        double average = ArrayOperations.getAverage(numbers);

        Assertions.assertEquals(10.5, average);
    }
}
