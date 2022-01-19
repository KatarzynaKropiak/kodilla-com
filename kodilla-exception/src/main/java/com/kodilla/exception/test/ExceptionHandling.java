package com.kodilla.exception.test;


public class ExceptionHandling {
    public static void main(String[] args) {
        String result;
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            result = secondChallenge.probablyIWillThrowException(1, 5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("A and B are beyond the accepted values");
        } finally {
            System.out.println("Calculation has been finished!");
        }

    }
}
