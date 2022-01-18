package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        double result;
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            result = firstChallenge.divide(3, 5);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by Zero is undefined");
        } finally {
            System.out.println("Calculation has been finished!");
        }

    }
}
