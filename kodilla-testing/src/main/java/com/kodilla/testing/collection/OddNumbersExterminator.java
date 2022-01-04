package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {
    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

            for (int n = 0; n < numbers.size(); n++) {
                if (numbers.get(n) % 2 == 0)
                {
                    evenNumbers.add(numbers.get(n));
                }
            }
        System.out.println(evenNumbers);
        return evenNumbers;
    }
}
