package com.kodilla.spring.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
        (classes = {com.kodilla.spring.calculator.Calculator.class, com.kodilla.spring.calculator.Display.class})
public class CalculatorTestSuite {

    @Autowired
    private Calculator calc;

    @Test
        public void  testCalculations() {
            //Given
            double a = 3;
            double b = 4;
            //When
            //Then
            assertEquals(7, calc.add(a,b));
            assertEquals(-1, calc.sub(a,b));
            assertEquals(12, calc.mul(a,b));
            assertEquals(0.75, calc.div(a,b));
    }

    }

