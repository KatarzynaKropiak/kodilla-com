package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        int a = -1;
        int b = 2;

        if (a + b == Calculator.add(a, b)) {
            System.out.println("Test \"Calculator - add method\" is OK!");
        } else {
            System.out.println("Error!");
        }
        if (a - b == Calculator.subtract(a, b)) {
            System.out.println("Test \"Calculator - subtract method\" is OK!");
        } else {
            System.out.println("Error!");
        }

    }

}