package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("warsaw", "radom");

        try {
            flightSearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            {
                System.out.println("There is no flight to this airport");


            }
            System.out.println("Processing other search!");
        }
    }
}
