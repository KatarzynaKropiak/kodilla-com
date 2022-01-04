package com.kodilla.testing.collection;

// import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("checking how OddNumbersExterminator is working when List is empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> listOfIntegers = new ArrayList<Integer>();
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> result = exterminator.exterminate(listOfIntegers);
        //Then
        Assertions.assertTrue(result.isEmpty());
    }
    @DisplayName("checking how OddNumbersExterminator is working when List contains even and odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> listOfIntegers = new ArrayList<Integer>();
        for (int n = 1; n < 10; n++) {
            listOfIntegers.add(n);
        }
//        List<Integer> evenNumbers = new ArrayList<Integer>();
//        evenNumbers.add(2);
//        evenNumbers.add(4);
//        evenNumbers.add(6);
//        evenNumbers.add(8);
        //When
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> result = exterminator.exterminate(listOfIntegers);
        //Then
        Assertions.assertEquals(Arrays.asList(2,4,6,8), result);
    }
}
