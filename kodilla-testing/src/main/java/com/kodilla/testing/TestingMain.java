package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.*;

public class TestingMain {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<Integer>();
        for (int n = 1; n < 100; n++) {
                listOfIntegers.add(n);
            }

            OddNumbersExterminator.exterminate(listOfIntegers);
        }
    }

