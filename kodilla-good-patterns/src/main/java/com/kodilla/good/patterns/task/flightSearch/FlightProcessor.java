package com.kodilla.good.patterns.task.flightSearch;

import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {

    public String getFlightsFrom(String departureAirport) {
        Flights flights = new Flights();
        String flightsFrom =
                flights
                        .getFlights()
                        .stream()
                        .filter(f -> f.getDeparture().equals(departureAirport))
                        .map(Object::toString)
                        .collect(Collectors.joining(" | ", " Flights from " + departureAirport + ": ", "."));
        System.out.println(flightsFrom);

        return flightsFrom;
    }

    public String getFlightsTo(String arrivalAirport) {
        Flights flights = new Flights();
        String flightsTo =
                flights
                        .getFlights()
                        .stream()
                        .filter(f -> f.getArrival().equals(arrivalAirport))
                        .map(Object::toString)
                        .collect(Collectors.joining(" | ", " Flights to  Warszawa " + arrivalAirport + "; ", "."));
        System.out.println(flightsTo);

        return flightsTo;
    }

    public void getFlightsThrough(String transferAirport) {
        Flights flights = new Flights();
        List<Flight> flightsFromList =
                flights
                        .getFlights()
                        .stream()
                        .filter(f -> f.getDeparture().equals(transferAirport))
                        .collect(Collectors.toList());


        List<Flight> flightsToList =
                flights
                        .getFlights()
                        .stream()
                        .filter(f -> f.getArrival().equals(transferAirport))
                        .collect(Collectors.toList());

        for (int i = 0; i < flightsToList.size(); i++) {
            for (int j = 0; j < flightsFromList.size(); j++) {
                if (flightsToList.get(i).getArrival().equals(flightsFromList.get(j).getDeparture()) &
                        !flightsToList.get(i).getDeparture().equals(flightsFromList.get(j).getArrival())) {
                    System.out.println("Flights through " + transferAirport + ": " + flightsToList.get(i).toString() + flightsFromList.get(j));
                }
            }
        }
    }
}