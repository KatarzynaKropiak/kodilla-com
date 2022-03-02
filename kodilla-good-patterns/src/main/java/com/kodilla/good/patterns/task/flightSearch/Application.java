package com.kodilla.good.patterns.task.flightSearch;

import java.util.List;
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


        List<Flight> flightsFromList =
                flights
                        .getFlights()
                        .stream()
                        .filter(f -> f.getDeparture().equals("Warszawa"))
                        .collect(Collectors.toList());


        List<Flight> flightsToList =
                flights
                        .getFlights()
                        .stream()
                        .filter(f -> f.getArrival().equals("Warszawa"))
                        .collect(Collectors.toList());

        for (int i = 0; i<flightsToList.size(); i++) {
            for (int j = 0; j<flightsFromList.size(); j++) {
                if (flightsToList.get(i).getArrival().equals(flightsFromList.get(j).getDeparture()) &
                        !flightsToList.get(i).getDeparture().equals(flightsFromList.get(j).getArrival())) {
                    System.out.println(flightsToList.get(i).toString() + flightsFromList.get(j));
            }
        }
    }

    }
}