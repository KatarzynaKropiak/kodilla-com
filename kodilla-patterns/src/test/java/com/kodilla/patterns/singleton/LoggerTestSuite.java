package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void createLog() {
        logger = Logger.INSTANCE;
        logger.log("log1");
    }


    @Test
    void testCreateLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Log: " + lastLog);
        //Then
        assertEquals("log1", lastLog);
    }

}
