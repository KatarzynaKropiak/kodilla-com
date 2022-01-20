package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightSearch = new HashMap<>();
        flightSearch.put("warsaw", true);
        flightSearch.put("radom", false);

        if (flightSearch.containsKey(flight.getArrivalAirport())) {
            System.out.println("There is flight from " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("There is no airport in this town");
        }
    }
}