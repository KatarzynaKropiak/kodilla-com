package com.kodilla.good.patterns.task.flightSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Flights {

    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Poznań"));
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Wrocław", "Poznań"));
        flights.add(new Flight("Wrocław", "Warszawa"));
        flights.add(new Flight("Poznań", "Wrocław"));
        flights.add(new Flight("Poznań", "Warszawa"));

        return flights;
    }
}