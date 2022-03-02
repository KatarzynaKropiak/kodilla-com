package com.kodilla.good.patterns.task.flightSearch;


public class Application {
    public static void main(String[] args) {
        FlightProcessor flightProcessor = new FlightProcessor();
            flightProcessor.getFlightsFrom("Warszawa");
            flightProcessor.getFlightsTo("Wrocław");
            flightProcessor.getFlightsThrough("Warszawa");

    }
}