package com.kodilla.good.patterns.task.flightSearch;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Application {
    public static void main(String[] args) {

        Flights flights = new Flights();
        String flightsFrom =
                flights
                        .getFlights()
                        .stream()
                        .filter(f -> f.getDeparture().equals("Warszawa"))
                        .map(Object::toString)
                        .collect(Collectors.joining(" | ", " Flights from Warszawa: ", "."));
        System.out.println(flightsFrom);

        String flightsTo =
                flights
                        .getFlights()
                        .stream()
                        .filter(f -> f.getArrival().equals("Warszawa"))
                        .map(Object::toString)
                        .collect(Collectors.joining(" | ", " Flights to  Warszawa: ", "."));
        System.out.println(flightsTo);

        Stream<Flight> flightsThrough = Stream.concat(
                flights.getFlights().stream().filter(f -> f.getArrival().equals("Warszawa")),
                flights.getFlights().stream().filter(f -> f.getDeparture().equals("Warszawa")));

        String flightThrough =
                flightsThrough
                .map(Objects::toString)
                .collect(Collectors.joining(" ", " Flights through Warszawa: ", "."));
        System.out.println(flightThrough);







    }
}
